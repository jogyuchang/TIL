from flask import Flask, render_template
import datetime
import random

# 지금부터 flask 서버의 이름이 app
app = Flask(__name__)

# url를 관리해주는 친구 > @app.route("/")
@app.route("/")
def hello():
    return "안녕!!"

@app.route("/dday")
def dday():
    today = datetime.datetime.now()
    print(today)
    final = datetime.datetime(2020, 6, 9)
    result = final - today
    print(result)
    return f"{result.days}일 남았습니다."

# is it christmas 실습
# "/christmas
@app.route("/christmas")
def chris():
    today = datetime.datetime.now()
    month = today.date().month
    day = today.date().day
    print(today.date().strftime("%Y년 %m월 %d일"))
    if month == 12 and day == 25:
        return "<h1>예<h1>"
    else :
        return "<h1>아니오<h1>"

@app.route("/movies")
def movies():
    movies = ["겨울왕국2", "클라우스", "어바웃타임", "나홀로집에1","러브액츄얼리"]
    return render_template("movie.html", movies=movies)

@app.route("/greeting/<name>")
def greeting(name):
    print(name)
    return f"안녕하세요! {name}님!"

@app.route("/cube/<int:num>")
def cube(num):
    result = num ** 3
    return str(result)

# 식사 메뉴 추천
# 1. random
# 2. DR_url : @app.route("/lunch/1 2 3 4")
# - List : ["자장면", "짬뽕", "오므라이스", "볶음밥", "고추잡채"]
# - <int:num> 숫자 만큼 뽑기

@app.route("/lunch/<int:num>")
def lunch(num):
    food = ["자장면", "짬뽕", "오므라이스", "볶음밥", "고추잡채"]
    my_food = random.sample((0, 5), num)
    




# flask run
# Debug Mode > python app.py
if __name__=="__main__" :
    app.run(debug=True)