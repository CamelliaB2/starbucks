kong-run:
	docker run -d --name kong \
	--network=starbucks \
	-e "KONG_DATABASE=off" \
	-e "KONG_PROXY_ACCESS_LOG=/dev/stdout" \
	-e "KONG_ADMIN_ACCESS_LOG=/dev/stdout" \
	-e "KONG_PROXY_ERROR_LOG=/dev/stderr" \
	-e "KONG_ADMIN_ERROR_LOG=/dev/stderr" \
	-e "KONG_ADMIN_LISTEN=0.0.0.0:8001, 0.0.0.0:8444 ssl" \
	-p 81:8000 \
	-p 443:8443 \
	-p 8001:8001 \
	-p 8444:8444 \
	kong:2.4.0

config-kong:
	http :8001/config config=@kong.yaml
	docker exec -it kong kong reload