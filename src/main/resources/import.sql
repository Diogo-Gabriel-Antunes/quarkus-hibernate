INSERT INTO public.beneficios
(id, benefits) VALUES (0,'Vale refeição');
INSERT INTO public.beneficios
(id, benefits) VALUES (1,'Vale alimentação');
INSERT INTO public.beneficios
(id, benefits) VALUES (2,'Plano odontológico');
INSERT INTO public.beneficios
(id, benefits) VALUES (3,'Seguro de vida');
INSERT INTO public.beneficios
(id, benefits) VALUES (4,'Day off no aniversário');
INSERT INTO public.beneficios
(id, benefits) VALUES (5,'Vale alimentação');
INSERT INTO public.beneficios
(id, benefits) VALUES (6,'Auxílio-creche');
INSERT INTO public.beneficios
(id, benefits) VALUES (7,'Vale academia');
INSERT INTO public.beneficios
(id, benefits) VALUES (8,'Vale transporte ou vale combustível');
INSERT INTO public.beneficios
(id, benefits) VALUES (9,'Plano de saúde');
INSERT INTO public.beneficios
(id, benefits) VALUES (10,'Jornada flexível');
INSERT INTO public.beneficios
(id, benefits) VALUES (11,'Home office periódico');
INSERT INTO public.beneficios
(id, benefits) VALUES (12,'Assistência psicológica');

-- Auto-generated SQL script #202211050655
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (0,'Front-end','AngularJS');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (1,'Front-end','React');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (2,'Front-end','React native');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (3,'Front-end','Angular');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (4,'Front-end','Angular 14');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (5,'Back-end','Java');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (6,'Back-end','PHP');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (7,'Back-end','Node.js');
INSERT INTO public.tecnologias (id,category,technologies)
	VALUES (8,'Back-end','Ruby');


INSERT INTO public.empresas
(id, cnpj, adress, companydescription, companyname, corporateemail, managerrh, numberemployees)
VALUES(1, 'DSADAS', 'DASDSADA', 'DASDSAD', 'DASDSADA', 'DSADASDA', 'DSADADAS', 22);
INSERT INTO public.empresas
(id, cnpj, adress, companydescription, companyname, corporateemail, managerrh, numberemployees)
VALUES(2, 'DSADAS', 'DASDSADA', 'DASDSAD', 'DASDSADA', 'DSADASDA', 'DSADADAS', 22);

INSERT INTO public.empresas
(id, cnpj, adress, companydescription, companyname, corporateemail, managerrh, numberemployees)
VALUES(3, 'DSADAS', 'DASDSADA', 'DASDSAD', 'DASDSADA', 'DSADASDA', 'DSADADAS', 22);

INSERT INTO public.empresas
(id, cnpj, adress, companydescription, companyname, corporateemail, managerrh, numberemployees)
VALUES(4, 'DSADAS', 'DASDSADA', 'DASDSAD', 'DASDSADA', 'DSADASDA', 'DSADADAS', 22);

INSERT INTO public.empresas
(id, cnpj, adress, companydescription, companyname, corporateemail, managerrh, numberemployees)
values(5, 'DSADAS', 'DASDSADA', 'DASDSAD', 'DASDSADA', 'DSADASDA', 'DSADADAS', 22);

INSERT INTO public.vagas
(id, active, activities, category, jobdescription, jobtitle, salaryrange, salaryrangemax, seniority, typeofcontract, vacancylocation, companyid_id)
VALUES(0, false, 'dsadsada', 'dsadsadsa', 'dassadas', 'dasdsadsad', 0, 0, 'dsadsadsa', 'dsadasda', 'dsadsada', 1);

INSERT INTO public.vagas
(id, active, activities, category, jobdescription, jobtitle, salaryrange, salaryrangemax, seniority, typeofcontract, vacancylocation, companyid_id)
VALUES(1, false, 'dsadsada', 'dsadsadsa', 'dassadas', 'dasdsadsad', 0, 0, 'dsadsadsa', 'dsadasda', 'dsadsada', 2);

INSERT INTO public.vagas
(id, active, activities, category, jobdescription, jobtitle, salaryrange, salaryrangemax, seniority, typeofcontract, vacancylocation, companyid_id)
VALUES(2, false, 'dsadsada', 'dsadsadsa', 'dassadas', 'dasdsadsad', 0, 0, 'dsadsadsa', 'dsadasda', 'dsadsada', 3);
INSERT INTO public.vagas
(id, active, activities, category, jobdescription, jobtitle, salaryrange, salaryrangemax, seniority, typeofcontract, vacancylocation, companyid_id)
VALUES(3, false, 'dsadsada', 'dsadsadsa', 'dassadas', 'dasdsadsad', 0, 0, 'dsadsadsa', 'dsadasda', 'dsadsada', 4);
INSERT INTO public.vagas
(id, active, activities, category, jobdescription, jobtitle, salaryrange, salaryrangemax, seniority, typeofcontract, vacancylocation, companyid_id)
VALUES(4, false, 'dsadsada', 'dsadsadsa', 'dassadas', 'dasdsadsad', 0, 0, 'dsadsadsa', 'dsadasda', 'dsadsada', 5);