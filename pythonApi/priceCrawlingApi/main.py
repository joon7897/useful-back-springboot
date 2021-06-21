# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
import datetime
import json
import bs4
import requests
from pprint import pprint
from util import util
from flask import Flask
app = Flask (__name__)



@app.route('/productInfo/<goodsNo>')
def callProductInfo(goodsNo):
    ## 크롤링에 필요한 정보.
    headers = {'User-Agent': 'Mozilla/5.0'}
    url = 'https://store.musinsa.com/app/goods/'+goodsNo             ## goods 뒤에 제품번호 따로 빼야함.

    ## 어플리케이션 실행 시간.
    now = datetime.datetime.now()
    nowDate = now.strftime('%Y-%m-%d %H:%M')
    util.print_hi('PyCharm Start in ' + nowDate)


    ## 크롤링.
    response = requests.get(url, headers=headers)

    ## 크롤링 결과.
    if response.status_code == 200:  ## 호출 성공

        html = response.text
        soup = bs4.BeautifulSoup(html, 'html.parser')
        resultRows = soup.find_all('script')

        for row in resultRows:
            chkStr = str(row)
            subLeftChar = 'stateAll = '
            subRightChar = ';'
            val = subLeftChar in chkStr

            if val:  ## stateAll 변수 존재할때 JsonObj로 던짐.
                print('##################################')
                print('Musinsa Crawling result[', row, ']')

                print('#####################################')
                print(chkStr.find(subRightChar, 0))  ## ; 를 찾은것중 0번째 위치
                print(chkStr.find(subLeftChar) + len(subLeftChar))
                subLeftStr = chkStr[chkStr.find(subLeftChar) + len(subLeftChar):]
                subRightStr = subLeftStr[:subLeftStr.find(subRightChar, 0)]


                jsonResult = json.loads(subRightStr)
                jsonResult.get("productInfo").pop("img_prd_list")                   ## 불필요 key제거 ex) image관련 정보

                print(json.dumps(jsonResult, indent=4, sort_keys=True, ensure_ascii=False))
            # else:
            # print('Musinsa Crawling result ERROR! Check HTML Tag Exist....')
    else:  ## 호출 실패.
        print(response.content)
        print(response.status_code)
        return response.content

    return json.dumps(jsonResult, indent=2, sort_keys=True, ensure_ascii=False)



@app.route('/productInfo')
def callProductInfoTest():
    ## 크롤링에 필요한 정보.
    headers = {'User-Agent': 'Mozilla/5.0'}
    url = 'https://store.musinsa.com/app/goods/1022014'             ## 테스트 url

    ## 어플리케이션 실행 시간.
    now = datetime.datetime.now()
    nowDate = now.strftime('%Y-%m-%d %H:%M')
    util.print_hi('PyCharm Start in ' + nowDate)


    ## 크롤링.
    response = requests.get(url, headers=headers)

    ## 크롤링 결과.
    if response.status_code == 200:  ## 호출 성공

        html = response.text
        soup = bs4.BeautifulSoup(html, 'html.parser')
        resultRows = soup.find_all('script')

        for row in resultRows:
            chkStr = str(row)
            subLeftChar = 'stateAll = '
            subRightChar = ';'
            val = subLeftChar in chkStr

            if val:  ## stateAll 변수 존재할때 JsonObj로 던짐.
                print('##################################')
                print('Musinsa Crawling result[', row, ']')

                print('#####################################')
                print(chkStr.find(subRightChar, 0))  ## ; 를 찾은것중 0번째 위치
                print(chkStr.find(subLeftChar) + len(subLeftChar))
                subLeftStr = chkStr[chkStr.find(subLeftChar) + len(subLeftChar):]
                subRightStr = subLeftStr[:subLeftStr.find(subRightChar, 0)]

                print('subLeftStr####################################')
                print(subLeftStr)
                print('subRightStr####################################')
                print(subRightStr)

                jsonResult = json.loads(subRightStr)
                jsonResult.get("productInfo").pop("img_prd_list")                   ## 불필요 key제거 ex) image관련 정보

                print(json.dumps(jsonResult, indent=4, sort_keys=True, ensure_ascii=False))
            # else:
            # print('Musinsa Crawling result ERROR! Check HTML Tag Exist....')
    else:  ## 호출 실패.
        print(response.content)
        print(response.status_code)
        return response.content

    return json.dumps(jsonResult, indent=2, sort_keys=True, ensure_ascii=False)



# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    app.run()









