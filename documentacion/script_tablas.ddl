-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-06-27 23:46:13 CDT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



DROP TABLE actividad_mejora CASCADE CONSTRAINTS;

DROP TABLE administrador CASCADE CONSTRAINTS;

DROP TABLE asesoria CASCADE CONSTRAINTS;

DROP TABLE capacitacion CASCADE CONSTRAINTS;

DROP TABLE empresa CASCADE CONSTRAINTS;

DROP TABLE instancia_capacitacion CASCADE CONSTRAINTS;

DROP TABLE profesionales CASCADE CONSTRAINTS;

DROP TABLE reporte_accidente CASCADE CONSTRAINTS;

DROP TABLE reporte_cliente CASCADE CONSTRAINTS;

DROP TABLE representante CASCADE CONSTRAINTS;

DROP TABLE revision_mejora CASCADE CONSTRAINTS;

DROP TABLE visita CASCADE CONSTRAINTS;

CREATE TABLE actividad_mejora (
    id_act_mej              INTEGER NOT NULL,
    problema_detectado      VARCHAR2(500 CHAR) NOT NULL,
    mejora_propuesta        VARCHAR2(1000 CHAR) NOT NULL,
    empresa_rut_empresa     INTEGER NOT NULL,
    profesionales_rut_prof  INTEGER NOT NULL
);

ALTER TABLE actividad_mejora ADD CONSTRAINT actividad_mejora_pk PRIMARY KEY ( id_act_mej );

CREATE TABLE administrador (
    id_adm                  INTEGER NOT NULL,
    usuario_administrador   VARCHAR2(20 CHAR) NOT NULL,
    clave_administrador     VARCHAR2(8 CHAR) NOT NULL,
    nombre_administrador    VARCHAR2(100 CHAR) NOT NULL,
    telefono_administrador  INTEGER NOT NULL,
    correo_administrador    VARCHAR2(60 CHAR) NOT NULL,
    rut_administrador       INTEGER NOT NULL
);

ALTER TABLE administrador ADD CONSTRAINT administrador_pk PRIMARY KEY ( rut_administrador );

CREATE TABLE asesoria (
    id_ase                    INTEGER NOT NULL,
    fecha_asesoria_agendada   DATE NOT NULL,
    fecha_asesoria_realizada  DATE,
    asesoria_incluida         CHAR(1) NOT NULL,
    tipo_asesoria             VARCHAR2(100 CHAR) NOT NULL,
    tema_asesoria             VARCHAR2(100 CHAR) NOT NULL,
    observaciones_asesoria    VARCHAR2(3000 CHAR),
    empresa_rut_empresa       INTEGER NOT NULL,
    profesionales_rut_prof    INTEGER NOT NULL
);

ALTER TABLE asesoria ADD CONSTRAINT asesoria_pk PRIMARY KEY ( id_ase );

CREATE TABLE capacitacion (
    id_cap                       INTEGER NOT NULL,
    nombre_capacitacion          VARCHAR2(80 CHAR) NOT NULL,
    fecha_creacion_capacitacion  DATE NOT NULL,
    vigencia_capacitacion        CHAR(1) NOT NULL
);

ALTER TABLE capacitacion ADD CONSTRAINT capacitacion_pk PRIMARY KEY ( id_cap );

CREATE TABLE empresa (
    id_emp                          INTEGER NOT NULL,
    nombre_empresa                  VARCHAR2(150 CHAR) NOT NULL,
    representante_empresa           VARCHAR2(100 CHAR) NOT NULL,
    rut_empresa                     INTEGER NOT NULL,
    dirección_empresa               VARCHAR2(150 CHAR) NOT NULL,
    telefono_empresa                INTEGER NOT NULL,
    correo_empresa                  VARCHAR2(60 CHAR) NOT NULL,
    giro_empresa                    VARCHAR2(100 CHAR) NOT NULL,
    fecha_ingreso_empresa           DATE NOT NULL,
    numero_trabajadores_enero       INTEGER,
    numero_trabajadores_abril       INTEGER,
    numero_trabajadores_julio       INTEGER,
    numero_trabajadores_septiembre  INTEGER,
    tasa_accidentabilidad           NUMBER(7, 4),
    administrador_rut_admin         INTEGER NOT NULL
);

ALTER TABLE empresa ADD CONSTRAINT empresa_pk PRIMARY KEY ( rut_empresa );

CREATE TABLE instancia_capacitacion (
    id_ins                      INTEGER NOT NULL,
    fecha_agendada              DATE NOT NULL,
    fecha_realizada             DATE NOT NULL,
    estado_capacitacion         CHAR(1 CHAR) NOT NULL,
    tema_capacitacion           VARCHAR2(100 CHAR) NOT NULL,
    observaciones_capacitacion  VARCHAR2(3000 CHAR),
    capacitacion_id_cap         INTEGER NOT NULL,
    empresa_rut_empresa         INTEGER NOT NULL,
    profesionales_rut_prof      INTEGER NOT NULL
);

ALTER TABLE instancia_capacitacion ADD CONSTRAINT instancia_capacitacion_pk PRIMARY KEY ( id_ins );

CREATE TABLE profesionales (
    id_pro                     INTEGER NOT NULL,
    nombre_profesional         VARCHAR2(80 CHAR) NOT NULL,
    apellido_profesional       VARCHAR2(80 CHAR) NOT NULL,
    rut_profesional            INTEGER NOT NULL,
    departamento_profesional   VARCHAR2(80 CHAR) NOT NULL,
    telefono_profesional       INTEGER NOT NULL,
    correo_profesional         VARCHAR2(60 CHAR) NOT NULL,
    cargo_profesional          VARCHAR2(150 CHAR) NOT NULL,
    profesion_profesional      VARCHAR2(150 CHAR) NOT NULL,
    fecha_ingreso_profesional  DATE NOT NULL,
    usuario_profesional        VARCHAR2(20 CHAR) NOT NULL,
    clave_profesional          VARCHAR2(8 CHAR) NOT NULL,
    administrador_rut_admin    INTEGER NOT NULL
);

ALTER TABLE profesionales ADD CONSTRAINT profesionales_pk PRIMARY KEY ( rut_profesional );

CREATE TABLE reporte_accidente (
    id_rep_acc                INTEGER NOT NULL,
    tipo_accidente            VARCHAR2(100 CHAR) NOT NULL,
    descripcion_accidente     VARCHAR2(3000 CHAR) NOT NULL,
    empresa_rut_empresa       INTEGER NOT NULL,
    representante_rut_repres  INTEGER NOT NULL
);

ALTER TABLE reporte_accidente ADD CONSTRAINT reporte_accidente_pk PRIMARY KEY ( id_rep_acc );

CREATE TABLE reporte_cliente (
    id_rep_cli                  INTEGER NOT NULL,
    inicio_periodo_reporte      DATE NOT NULL,
    fin_periodo_reporte         DATE NOT NULL,
    accidentes_periodo          INTEGER NOT NULL,
    tasa_accidentabilidad       NUMBER(7, 4) NOT NULL,
    capacitaciones_periodo      INTEGER NOT NULL,
    asesorias_periodo           INTEGER NOT NULL,
    visitas_periodo             INTEGER NOT NULL,
    actividades_mejora_periodo  INTEGER NOT NULL,
    empresa_rut_empresa         INTEGER NOT NULL,
    administrador_rut_admin     INTEGER NOT NULL
);

ALTER TABLE reporte_cliente ADD CONSTRAINT reporte_cliente_pk PRIMARY KEY ( id_rep_cli );

CREATE TABLE representante (
    id_rep                  INTEGER NOT NULL,
    usuario_representante   VARCHAR2(20 CHAR) NOT NULL,
    clave_representante     VARCHAR2(8 CHAR) NOT NULL,
    nombre_representante    VARCHAR2(100 CHAR) NOT NULL,
    telefono_representante  INTEGER NOT NULL,
    correo_representante    VARCHAR2(60 CHAR) NOT NULL,
    rut_representante       INTEGER NOT NULL,
    empresa_rut_empresa     INTEGER NOT NULL
);

ALTER TABLE representante ADD CONSTRAINT representante_pk PRIMARY KEY ( rut_representante );

CREATE TABLE revision_mejora (
    id_rev_mej                     INTEGER NOT NULL,
    cumplimiento_revision_mejora   CHAR(1) NOT NULL,
    observaciones_revision_mejora  VARCHAR2(3000 CHAR) NOT NULL,
    actividad_mejora_id_act_mej    INTEGER NOT NULL,
    profesionales_rut_profesional  INTEGER NOT NULL
);

ALTER TABLE revision_mejora ADD CONSTRAINT revision_mejora_pk PRIMARY KEY ( id_rev_mej );

CREATE TABLE visita (
    id_vis                         INTEGER NOT NULL,
    motivo_visita                  VARCHAR2(200 CHAR) NOT NULL,
    observacion_visita             VARCHAR2(3000 CHAR) NOT NULL,
    empresa_rut_empresa            INTEGER NOT NULL,
    profesionales_rut_profesional  INTEGER NOT NULL
);

ALTER TABLE visita ADD CONSTRAINT visita_pk PRIMARY KEY ( id_vis );

ALTER TABLE actividad_mejora
    ADD CONSTRAINT actividad_mejora_empresa_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE actividad_mejora
    ADD CONSTRAINT actividad_mejora_prof_fk FOREIGN KEY ( profesionales_rut_prof )
        REFERENCES profesionales ( rut_profesional );

ALTER TABLE asesoria
    ADD CONSTRAINT asesoria_empresa_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE asesoria
    ADD CONSTRAINT asesoria_profesionales_fk FOREIGN KEY ( profesionales_rut_prof )
        REFERENCES profesionales ( rut_profesional );

ALTER TABLE empresa
    ADD CONSTRAINT empresa_administrador_fk FOREIGN KEY ( administrador_rut_admin )
        REFERENCES administrador ( rut_administrador );

ALTER TABLE instancia_capacitacion
    ADD CONSTRAINT instancia_capacitacion_cap_fk FOREIGN KEY ( capacitacion_id_cap )
        REFERENCES capacitacion ( id_cap );

ALTER TABLE instancia_capacitacion
    ADD CONSTRAINT instancia_capacitacion_emp_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE instancia_capacitacion
    ADD CONSTRAINT instancia_capacitacion_prof_fk FOREIGN KEY ( profesionales_rut_prof )
        REFERENCES profesionales ( rut_profesional );

ALTER TABLE profesionales
    ADD CONSTRAINT profesionales_administrador_fk FOREIGN KEY ( administrador_rut_admin )
        REFERENCES administrador ( rut_administrador );

ALTER TABLE reporte_accidente
    ADD CONSTRAINT reporte_accidente_empresa_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE reporte_accidente
    ADD CONSTRAINT reporte_accidente_repres_fk FOREIGN KEY ( representante_rut_repres )
        REFERENCES representante ( rut_representante );

ALTER TABLE reporte_cliente
    ADD CONSTRAINT reporte_cliente_admin_fk FOREIGN KEY ( administrador_rut_admin )
        REFERENCES administrador ( rut_administrador );

ALTER TABLE reporte_cliente
    ADD CONSTRAINT reporte_cliente_empresa_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE representante
    ADD CONSTRAINT representante_empresa_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE revision_mejora
    ADD CONSTRAINT revision_mejora_act_mej_fk FOREIGN KEY ( actividad_mejora_id_act_mej )
        REFERENCES actividad_mejora ( id_act_mej );

ALTER TABLE revision_mejora
    ADD CONSTRAINT revision_mejora_prof_fk FOREIGN KEY ( profesionales_rut_profesional )
        REFERENCES profesionales ( rut_profesional );

ALTER TABLE visita
    ADD CONSTRAINT visita_empresa_fk FOREIGN KEY ( empresa_rut_empresa )
        REFERENCES empresa ( rut_empresa );

ALTER TABLE visita
    ADD CONSTRAINT visita_profesionales_fk FOREIGN KEY ( profesionales_rut_profesional )
        REFERENCES profesionales ( rut_profesional );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            12
-- CREATE INDEX                             0
-- ALTER TABLE                             30
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
