param (
    [string]$PowerShellParam = "value",
)
Write-Host "Current week number: $(get-Date -uformat %W)"