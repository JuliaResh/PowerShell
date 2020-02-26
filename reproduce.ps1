$ErrorActionPreference = "stop"
python -c "import sys; print('hello from stderr 1', file=sys.stderr)"
python -c "import sys; print('hello from stderr 2', file=sys.stderr)"
python -c "import sys; print('hello from stderr 3', file=sys.stderr)"
