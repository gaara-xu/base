@echo off
setlocal enabledelayedexpansion
set context=%1
echo start ...
git pull origin base
git add .
git commit -m "commit by: !context!"
git push origin base
echo end ...
