# Git HOL 2 – Git Ignore

## Objective

This hands-on lab demonstrates how to use a `.gitignore` file to prevent unwanted files and folders from being tracked by Git.

---

## Prerequisites

- Git installed on your system
- Git repository initialized
- Git configured with username and email
- Windows Notepad (or Notepad++) configured as the default editor

---

## Project Structure

```
GitDemo/
│── .git/
│── .gitignore
│── welcome.txt
│── error.log
└── log/
    └── app.log
```

---

## Steps Performed

### 1. Navigate to the Git repository

```bash
cd GitDemo
```

### 2. Create a log folder

```bash
mkdir log
```

### 3. Create log files

```bash
echo Sample Log > error.log
echo Application Log > log/app.log
```

### 4. Create `.gitignore`

```bash
touch .gitignore
```

Add the following content:

```gitignore
*.log
log/
```

### 5. Verify Git Status

```bash
git status
```

Only `.gitignore` should appear as an untracked file.

### 6. Add `.gitignore`

```bash
git add .gitignore
```

### 7. Commit Changes

```bash
git commit -m "Added gitignore file"
```

### 8. Push to Remote Repository

```bash
git push -u origin master
```

> If your default branch is `main`, use:

```bash
git push -u origin main
```

---

## `.gitignore`

```gitignore
*.log
log/
```

---

## Expected Output

- All `.log` files are ignored.
- The `log/` directory is ignored.
- Only required project files are tracked by Git.

---

## Author

**Jaya Sri**
