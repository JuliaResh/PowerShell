$text = 'Hello World'

# Create file:

$text | Set-Content 'file.txt'
#or
#$text | Out-File 'file2.txt'
#or
#$text > 'file3.txt'

# Append to file:

#$text | Add-Content 'file.txt'
#or
$text | Out-File 'file.txt' -Append
#or
$text >> 'file.txt'
