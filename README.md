# Template for Scala JVM projects

This template is a starting point for a Scala JVM project for PositionPal organization using Gradle as a build tool.

## Supported libs
- Scala 3.x
- Scala Test

## Additional support
- Gradle `scala-extras` plugin for additional support using ScalaFmt and ScalaFix

## Github Action support
- Semantic release
- Automatic deploy on dockerhub
- Automatic API documentation generation and deployment on GitHub pages

### On Docker support for the following repository

This template enables automatic deployment on Dockerhub using GitHub actions alongside semantic release. Make sure that
`DOCKERHUB_USERNAME` and `DOCKERHUB_TOKEN` are available on the repo's secrets.

Usage on `.github/workflows/docker.yml`
```
uses: docker/login-action@v3
with:
  username: ${{ secrets.DOCKERHUB_USERNAME }}
  password: ${{ secrets.DOCKERHUB_TOKEN }}
```
