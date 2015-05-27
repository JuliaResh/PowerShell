Write-Output "Hello, World"

for ( $i = 0; $i -lt $args.count; $i++ ) {
    Write-Output $args[$i]
}