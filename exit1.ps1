Param(
 [Parameter(Mandatory=$True, Position=1)] [string]$rootDirName
)

$a = 1
Write-Host "exit code is" $a
exit $a