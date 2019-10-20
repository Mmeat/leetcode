# leetcode
### 创建SSH

* 查看是否存在ssh

  ```bash
  $ cd ~/.ssh
  $ ls
  ```

* 创建一个ssh key

  ```bash
  $ ssh-keygen -t rsa -C "your_email@example.com"
  ```

* 拷贝key

  ```bash
  $ clip < ~/.ssh/id_rsa.pub
  ```

### git 常用命令

* 查看分支

  ```bash
  git branch
  ```

* 创建本地分支

  ```bash
  git checkout -b <branch>
  ```

* 推送本地分支到远端仓库

  ```bash
  git push --set-upstream origin <branch>
  ```

* 拉取远端分支到本地仓库

  ```bash
  git checkout -b <localbranch> origin/<originbranch>
  ```

  

  

  