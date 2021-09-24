# MySelenideHomeTests
В этом репозитории нахоядтся мои home проекты для автотестов с использованием PageObject паттерна и ООП. В этом проекте содержится 3 пакета с отдельными тестами

# Автотесты для инстаграма

В пакете instagram реализован следующий тест-кейс:

1) Открыть страницу с авторизацией
2) Ввести логин и пароль от аккаунта и нажать кнопку Войти
3) Перейти в свой профиль инстаграмма
4) Убедиться, что открыт именно нужный профиль (проверить текущую ссылку из браузера через Assert)
5) Открыть первый пост у себя в профиле
6) Добавить новый комментарий к посту
7) Убедиться, что комментарий добавился к посту

С помощью паттерна pageObject я создала следующие основные page-классы:
1) InstagramLoginePage (В этом классе происходит авторизация);
2) FeedPage (Страница с лентой, через нее мы переходим в мой профиль);
3) ProfilePage (Страница с профилем, через нее переходим к посту);
4) PostPage (Страница с постом, где мы получаем список с комментариями для дальнейших взаимодействий в тестовом классе);






