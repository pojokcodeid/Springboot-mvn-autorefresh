# Spring Boot Project Maven

- Pastikan Install Maven pada komputer anda
  https://maven.apache.org/download.cgi
- Pastikan Sudah ada pada env variable

-Run

```bash
mvn spring-boot:run
```

- Create Maven Project CLI
  - pastikan Sudah membuat MAVEN_HOME
  - pastikan sudah didaftarkan sebagai env variable

```bash
mvn archetype:generate "-DgroupId=com.example" "-DartifactId=testing" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DarchetypeVersion=1.4" "-DinteractiveMode=false"
```

#### -DgroupId=com.example: Menentukan group ID untuk proyek. Anda bisa menggantinya sesuai kebutuhan.

#### -DartifactId=testing: Menentukan nama proyek Anda.

#### -DarchetypeArtifactId=maven-archetype-quickstart: Menggunakan archetype quickstart untuk membuat proyek Maven dasar.

#### -DinteractiveMode=false: Menjalankan perintah dalam mode non-interaktif untuk menghindari prompt tambahan.
