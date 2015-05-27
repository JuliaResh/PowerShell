$text = 'Hello World'

# Create file:

$text | Set-Content 'file.txt'
#or
$text | Out-File 'file.txt'
#or
$text > 'file.txt'

# Append to file:

$text | Add-Content 'file.txt'
#or
$text | Out-File 'file.txt' -Append
#or
$text >> 'file.txt'