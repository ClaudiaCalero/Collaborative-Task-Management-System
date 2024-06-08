data.sql -- Insert roles --
INSERT INTO roles (id, name) VALUES ('1', 'ROLE_USER');
INSERT INTO roles (id, name) VALUES ('2', 'ROLE_ADMIN');

-- Insert users --
INSERT INTO users (id, username, password, enabled) VALUES ('1', 'user', 'password', true);
INSERT INTO users (id, username, password, enabled) VALUES ('2', 'admin', 'password', true);

-- Insert tasks --
INSERT INTO tasks (id, name, description, due_date, completed) VALUES ('1', 'task 1', 'description 1', '2023-12-31', false);
INSERT INTO tasks (id, name, description, due_date, completed) VALUES ('2', 'task 2', 'description 2', '2023-12-31', true);