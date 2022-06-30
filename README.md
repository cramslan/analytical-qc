## README

The Analytical QC application consists of four components:

- Database
- Static content
- Backend
- Frontend

**Database**: The database contains substance, sample, experiment, and file information along with structured and freeform annotations. It is currently located at ccte-postgres-res.dmap-prod.aws.epa.gov, under database res_gsincl01_qsar and schema sbox_analytical_qc. DDL and CSV table exports are located in the db directory of this project.

**Static content (content-server)**: Static files are served from a directory by an nginx server. The directory containing all files is currently located at L:/Lab/NCCT_Richard/Antony Williams/analytical-qc_GFBS_010722/analytical-qc_content-server_static.tar.gz. The contents of this file (~10 GB) should be extracted into the content-server/static directory of this project for deployment.

**Backend (server)**: A database API served by a Spring Boot web service.

**Frontend (client)**: A frontend interface in Vue.js, running on an nginx server.

## Deployment

This application is set up to deploy in Docker using docker-compose. It has been deployed on the v2626umcth819.rtord.epa.gov server.

0. Recreate and/or establish access to populated database.
1. Clone all repository contents to deployment location.
2. Extract static files to content-server/static directory.
3. Set environment variables (see below).
4. Run `docker-compose up -d --build`.

### Server environment variables

- DB_URL, DB_USER, DB_PASS, DB_SCHEMA: Standard database connection parameters
- DB_DRIVER, DB_DIALECT: Presently for PostgreSQL, made variable to enable compatibility with MySQL systems if needed in the future (MySQL driver included in pom.xml)
- CLIENT_URL: URL of client deployment to enable CORS
- DASHBOARD_API_URL: URL of CCD API to acquire new substance information

### Client environment variables

- VUE_APP_SERVER_URL: URL of server deployment
- VUE_APP_CONTENT_SERVER_URL: URL of content-server deployment