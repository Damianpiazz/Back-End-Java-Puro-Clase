# Clase 09 | Introducción a Git y Control de Versiones

## Índice

1. Conceptos fundamentales de control de versiones.
2. Instalación y configuración de Git.
3. Flujo de trabajo básico con Git.
4. Colaboración en proyectos mediante GitHub.
5. Buenas prácticas de versionado.
6. Introducción a Spring Boot (Clase 10).

---

## Objetivos de la Clase

- **Comprender el control de versiones**  
  Entender su propósito y beneficios en proyectos de software.

- **Instalar y configurar Git**  
  Aprender a configurar la herramienta principal de control de versiones.

- **Dominar el flujo de trabajo básico**  
  Crear repositorios, añadir cambios, hacer commits y push.

- **Colaborar con otros desarrolladores**  
  Usar GitHub para ramas, pull requests y revisiones de código.

---

## Control de Versiones

### ¿Qué es?
El control de versiones es una práctica esencial en el desarrollo de software que permite rastrear y gestionar los cambios realizados en el código fuente a lo largo del tiempo.

### Función
Registra quién realizó cada modificación, qué cambios se introdujeron y cuándo se efectuaron. Es crucial para la colaboración en equipo y la resolución eficiente de conflictos.

---

## Tipos de Control de Versiones

### Centralizados
Ejemplos: **SVN**, **CVS**  
Todo el historial se guarda en un servidor central. Limitaciones: dependencia del servidor y dificultad para trabajar offline.

### Descentralizados
Ejemplo: **Git**  
Cada desarrollador tiene una copia completa del repositorio. Permite trabajo offline y mayor robustez.  
Plataformas populares: **GitHub**, **GitLab**.

---

## Beneficios del Control de Versiones

- **Seguridad:** Recuperación de versiones previas.
- **Colaboración:** Visibilidad y comunicación entre desarrolladores.
- **Confianza:** Registro auditable de todos los cambios.

---

## Instalación de Git

1. **Descargar:** [git-scm.com/downloads](https://git-scm.com/downloads)
2. **Instalar:** Seguir pasos por defecto.
3. **Verificar:**
   ```bash
   git --version
   ```

---

## Configuración Inicial

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tuemail@example.com"
```

---

## Comandos Básicos Iniciales

| Comando | Descripción |
|----------|--------------|
| `git init` | Crea un nuevo repositorio local |
| `git status` | Muestra el estado actual del repositorio |
| `git add` | Prepara archivos modificados para commit |
| `git commit` | Registra cambios en el historial |

---

## Flujo de Trabajo Básico

1. **Inicializar:** `git init`
2. **Preparar:** `git add .`
3. **Guardar:** `git commit -m "mensaje"`
4. **Subir:** `git push origin main`
5. **Actualizar:** `git pull origin main`

---

## Ramas (Branches)

- **Crear una rama:**
  ```bash
  git branch nueva-funcionalidad
  ```
- **Cambiar de rama:**
  ```bash
  git checkout nueva-funcionalidad
  ```

Permiten trabajar en nuevas características sin afectar el código principal.

---

## GitHub

### ¿Qué es GitHub?
Es una plataforma para almacenar y compartir proyectos Git. Facilita la colaboración y revisión de código.

| Git | GitHub |
|-----|---------|
| Sistema de control de versiones | Plataforma basada en Git |
| Local | En la nube |

---

## Colaboración en GitHub

- **Fork:** Crear una copia del repositorio original.
- **Pull Request:** Solicitar la fusión de tus cambios con el repositorio principal.

---

## Buenas Prácticas

- Mensajes de commit claros.
- Commits pequeños y frecuentes.
- Uso de ramas para mantener la rama principal estable.

---

## Recursos Adicionales

- [Documentación Oficial de Git](https://git-scm.com/doc)
- [Guía de Git de Atlassian](https://www.atlassian.com/git/tutorials)
- [Video en YouTube](https://youtu.be/kEPF-MWGq1w?si=JHLbH1U-8w264PWn)

---

## Preguntas para Reflexionar

1. ¿Cómo mejora la productividad y colaboración el uso de Git y GitHub?
2. ¿Qué ventajas ofrece mantener un historial detallado de cambios?
3. ¿Cómo ayudan los branching models a mantener un flujo de trabajo ordenado?

---

## Ejercicio Práctico Obligatorio

### Parte 1: Repositorio Local
- Crear un repositorio local.
- Registrar cambios con `commit`.
- Crear una nueva rama y fusionarla.
- Hacer `push` al repositorio remoto.

### Parte 2: Repositorio Remoto
- Crear un repositorio vacío en GitHub.
- Enlazar con el proyecto local:
  ```bash
  git remote add origin <URL_DEL_REPO>
  git push -u origin main
  ```
- Verificar que los archivos se reflejan en GitHub.