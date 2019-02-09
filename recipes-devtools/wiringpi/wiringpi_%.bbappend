COMPATIBLE_MACHINE = ".*"

DEPENDS += "virtual/crypt"

BBCLASSEXTEND = "nativesdk"

FILES_${PN} += "/usr/share                 \
                /usr/bin/gpio              \
                /usr/share/man             \
                /usr/share/man/man1        \
                /usr/share/man/man1/gpio.1 \
               "
