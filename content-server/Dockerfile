FROM nginx:alpine

WORKDIR /content-server

COPY . .

COPY ./nginx.conf /etc/nginx/nginx.conf
CMD ["nginx", "-g", "daemon off;"]