CREATE SEQUENCE IF NOT EXISTS nikke_seq INCREMENT BY 50 START WITH 1;
SELECT setval('nikke_seq', (SELECT MAX(id) FROM nikke));
CREATE SEQUENCE IF NOT EXISTS doll_seq INCREMENT BY 50 START WITH 1;
SELECT setval('doll_seq', (SELECT MAX(id) FROM doll));
