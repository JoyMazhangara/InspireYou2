CREATE TABLE users (
user_id INT PRIMARY KEY,
first_name VARCHAR(25),
last_name VARCHAR(25),
email VARCHAR(25),
passhash VARCHAR(25)
)

INSERT INTO users (user_id, first_name, last_name, email, passhash)
VALUES
(1, 'Joy', 'Mazhangara', 'missyj233@gmail.com', 'happyfeet'),
(2, 'Ashtin', 'Laurion', 'ashtin.laurion@gmail.com', 'happyfeet2'),
(3, 'Farai', 'Mutatu', 'farai.mutatu@gmail.com', 'happyfeet3')


CREATE TABLE stories (
story_id INT PRIMARY KEY,
title VARCHAR(25),
story VARCHAR(255),
imageURL VARCHAR(500)
)

INSERT INTO stories (story_id, title, story, imageURL)
VALUES
(1,'Me vs Me', 'I finally feel confident in my own skin and in who I''m becoming. Growing up that was not always the case so I am thankful for the people that have encouraged me along the way.', 'https://lh3.googleusercontent.com/BQ1KqDwQUxLcXYKg6A4JM8dR6_d7fELkFUq5unp_9DWz0fgJlbSo5Ho3vxC88ZXJ5vphW-XnAFWvBCp08P_im9Tp6eZTGg9M5j0Bgvzbb4IRleIw03e3wqrSlSFzD-bV5zmKI3s5ci3sdxRxBBPT232ooIxUoqSx-faT_faUTTiFNtyIPnho5x_hwwFHJm3q0u7pIf_jAjRTULS-29_zAzoe9uLHdP78G2UpL3jpKc6AEMBBF5LP3lz22_osBaGHBwuD0JfPbuKm8nGdBoPkuM-1X1v_2dVlEj3qUHUzNMKgGAKXsg7r8j7ShjigfJxAbxm70sppqX7BOOrXylDPZYNH5Y6wuNTwnh2pTV_Iu0lLgK5pU-UP3ryEjBBNj5hnXeWX95rHKHxozoOFCPC_qb40oiAQd0EUK5AgqMRWusoVvOoio6zp4QslNzi_96Kr2f1jdasEI6gAEeppQLU8J3V5Ip0qFTNNBI0U44Ny35s5WqUH7bauP69Y9IcFj-HaLMOe4EG0cRUsL79CIb1qnzrxR3Tkt8cycbKPu5BugjKOCmuuUzecRxaMVd9u65qioiBnnpdaiz0keBELCJwoo-E4ZtOhEwmH8SplU7tP0E0x3Hzp6ZwXeFxlg1UBqZBVUQpFPPfCDv35CouA_-tRS453_F6GCcZeiJjk51C71HYcqwQ5tQAyJlIwQQtPjtjEXPAowidf-EUKFPCvcLixYiA=s657-no?authuser=0'),
(2,'My Hope', 'Why choose joy in the midst of all the trials, pains, and struggles in this world? That is because one day there will be no more. We GET to be a light, reminding and encouraging everybody to endure. Struggles are short-lived but joy will be forever.', 'https://lh3.googleusercontent.com/5rKjY0UQqJTYioIpZJOEvNX4ng1R-HSg4XzAIQMHwuIcWTgTtiaKMrwcZPPJ3Qh8jJvz683iqWHP15xPmK0mmioMSeeTcQBw6SfwjkvXAZQUAXAjHltg2r4QQ9K13_52ulBTkEM7JmPcm1HJg35rA2OltEoYIq4R6Dt3G3Dqod5Lk3bNhsQaZsy9Lp6aKhf3kxpOffw7Mwdo-okAaBYxNn-OigX1JYVW0Ud56-oAx1PhdIlEU_MRDnpnoluI009mUEd92FyG6mzYTUqEX6desZ3OsRElldKJQ6CtcRLvnaTnAYTRfIFiSwHuMQgo1XytvA2RhbgLoSv4ts9LrIcI6vd9_PDoQ0XfXwx6c6qhDmDAYK7v4qGS6cvb02jxiui6PQnKj6-f9LpmJceb-m2U2O9LiKtS5FniEeUp1oAi__qyDjPHm6e5pLJaJ1OTmAFk1S5mshDyJQfQ5H766LyKNQeAmjq-kKCxnPIGCLK7MeukU4tdK-QZCMVWoG1wszzbZt2M4bmYokkhuliViR758vUzk8vY2bxoGqWD-ekwKlImaX-PvM7r4vlRztzgtsXJycG7EtwvU_MC09gShnQhuo2ZqFHu-Kj2565sntaJjCo8_1OdcuBLM6XSLEpBehZUtA9EnSY-TUB7b6sQZkrOU-sQ_M__QI_9UE3N4PI7CepySAGzBCKH7P89skLDtx6UXNd_eAXAFuEmQJZJ_ilDWQ=w876-h657-no?authuser=0'),
(3,'My Strength', 'I found my strength by letting go of my weaknesses. Instead being ruled by insecurities I choose to focus on my strengths and bring out the strengths of those around me.', 'https://lh3.googleusercontent.com/sj3sAevdaXtcinvbXVUJk1o0i75dnMd6Wg2pVUEphg5x_VAnRilcl4QNWIzjQcuNas8VKcHlz0i6W-ZD7z0BAMQrl5ph0fO45Oemd3-Fr2nAAd3VBoSU524I4twH9qGKV26aLRvzQ0bORRRd8smS30F7_pb9ePaPZXoKRIgVnlvIOLCRxLuyoqjQQVX6nAbCaMTFURGnJNBubgeuqKI6u4K211xtYB25ePquMQRPqyrTZqRsHM6WsGF2P5gq8j-FJkbFPAD4YUsh2tGx4OO3WTpFV2zVvEc4I6NIW_dqrvWdm6TRGh9O2S6IoPaZnQXDG5bsk5racNr7ydTL2JXCSv7p90ZvFEJOZ8BzZ5oSIfSaqO0zrcVX9VhVl5Ficn4xC4H_6Ot0ATU1DGTYdDipe42CBvMS3sBmzbfcDGqYDhuyz5ysr8C56QhlEOr0n0z9gDw4XF460cF1YS1rvq5cHb6RkkMmzkfxUZhDS2pT7aEjQElEz2q8rH9RUbVVqsfCydPrAFUpnbwmhtMhEB9GefRhGjPl-CizROG_WsgDJ6AU46mdpU9JtYAgERQcYl5WEiEEbaUU7qVdOLd24sI0270Lm6__-2fb90yZxdUVbYY0Drt953TPpkv4pvUjflovMQj2T-xQ61MdRFWcPzUd4_G1tOb48ttL5xiaSA4Vgzh2B_exMVWk2y6ujE3LFLa_bIyEwcDq65NfHUPEM4_g3v4=s600-no?authuser=0')

CREATE TABLE compliments (
compliment_id INT PRIMARY KEY,
compliment VARCHAR(25)
)

INSERT INTO compliments
VALUES
(1, 'Nice shirt!'),
(2, 'You are amazing!'),
(3, 'You are so kind!'),
(4, 'You are so smart!'),
(5, 'You are so special!');



