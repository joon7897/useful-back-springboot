import requests
import time
import datetime
import bs4
import json
from util import util


def getCategoryListJob():
    now = time.localtime()
    current = "%04d-%02d-%02d %02d:%02d:%02d" % \
              (now.tm_year, now.tm_mon, now.tm_mday, now.tm_hour, now.tm_min, now.tm_sec)
    print("I'm working...")
    print("Category Job Excute! =", str(current))

    ## 크롤링에 필요한 정보.
    headers = {'User-Agent': 'Mozilla/5.0'}
    url = 'https://search.musinsa.com/category/001001'             ## 반팔티 카테고리(001001).

    ## 크롤링.
    response = requests.get(url, headers=headers)

    ## 크롤링 결과.
    if response.status_code == 200:  ## 호출 성공

        html = response.text
        soup = bs4.BeautifulSoup(html, 'html.parser')

        resultRows = soup.select(
            '#ui-id-4 > ul:nth-child(2)'
        )
        # resultRows = soup.find_all('script')
        print("## Call Suucces! response")
        # print(response.content)
        ## my_titles는 list 객체
        for title in resultRows:
            ## Tag안의 텍스트
            print(title.text)
            ## Tag의 속성을 가져오기(ex: href속성)
            print(title.get('href'))


    else:  ## 호출 실패.
        print(response.content)
        print(response.status_code)


