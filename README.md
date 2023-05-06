# SOFTNI-SyncProyecto

Para el despliegue del proyecto en railway es necesario añadir lo siguiente en el archivo build.gradle:


```
jar {    manifest {        attributes'Main-Class': 'com.softni.Application'    }}
```
