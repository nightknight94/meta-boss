# -fPIC is needed to prevent relocation errors when we compile with Yocto
# security flags. See this issue for more details:
#
# https://github.com/google/googletest/issues/854
#
# If that issue is fixed, we can probably remove the manual -fPIC flags here.

OECMAKE_C_FLAGS += " -fPIC"
OECMAKE_CXX_FLAGS += " -fPIC"

