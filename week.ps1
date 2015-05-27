param (
    [string]$PowerShellParam = "value"
)
Write-Host "Current week number (host): $(get-Date -uformat %W)"
Write-Output "Current week number (out): $(get-Date -uformat %W)"