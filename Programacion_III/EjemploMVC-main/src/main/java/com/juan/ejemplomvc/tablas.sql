-- Creación de la tabla 'proyectos'
CREATE TABLE proyectos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

-- Creación de la tabla 'tareas'
CREATE TABLE tareas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(255) NOT NULL,
    project_id INT,
    -- Definición de la clave foránea
    FOREIGN KEY (project_id) REFERENCES proyectos(id)
        ON DELETE CASCADE -- Elimina las tareas si se elimina el proyecto
);

-- Insertar proyectos de ejemplo
INSERT INTO proyectos (nombre) VALUES
('Proyecto Web E-commerce'),
('Aplicación Móvil de Ejercicio'),
('Sistema de Gestión de Clientes');

-- Insertar tareas para el 'Proyecto Web E-commerce' (ID 1)
INSERT INTO tareas (descripcion, project_id) VALUES
('Diseño de la página de inicio', 1),
('Desarrollo del carrito de compras', 1),
('Implementación del sistema de pago', 1),
('Configuración de la base de datos de productos', 1);

-- Insertar tareas para la 'Aplicación Móvil de Ejercicio' (ID 2)
INSERT INTO tareas (descripcion, project_id) VALUES
('Creación de la interfaz de usuario para el registro', 2),
('Desarrollo de la función de seguimiento de calorías', 2),
('Integración con API de mapas', 2);

-- Insertar tareas para el 'Sistema de Gestión de Clientes' (ID 3)
INSERT INTO tareas (descripcion, project_id) VALUES
('Módulo de registro de clientes', 3),
('Función de búsqueda de clientes', 3),
('Generación de informes', 3);