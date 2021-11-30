#include <syslog.h>

const char *ident = "myapp";

int
main() {

        openlog(ident, LOG_CONS, LOG_USER);

        syslog((LOG_USER | LOG_ERR), " something wrong! (%d)", __LINE__);

        closelog();

	return 1;
}

