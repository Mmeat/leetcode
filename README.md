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

* 本地仓库关联到远端仓库

  ```bash
  #初始化
  git init
  #关联远端仓库
  git remote add origin <giturl>
  #提交
  git add .
  git commit -m '提交信息'
  git push -u origin <branch>
  #如果远端仓库不为空会提交失败
  #处理--rebase
  #拉取远端仓库文件
  git pull --rebase origin <branch>
  #此时有冲突手动解决下冲突
  git rebase --continue
  #继续提交
  git push -u origin <branch>
  #如果还不行 强制merge
  git push origin <branch> --allow-unrelated-histories
  ```

* 