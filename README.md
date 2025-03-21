# 七七智能云图库
## 项目介绍

基于Spring Boot+Redis+COS+AI+WebSocket的企业级智能协同云图库平台。
该项目为智能云图库平台。分为公共图库、私有图库和团队共享图库三大模块。用户可在平台公开上传和检索图片；管理员可以上传、审核和管理分析图片。个人用户可将图片上传至私有空间进行批量管理、多维检索、编辑和分析；企业可开通团队空间并邀请成员，共享和实时协同编辑图片。

（1）所有用户都可以在平台公开上传和检索图片素材，快速找到需要的图片。可用作表情包网站、设计素材网站、壁纸网站等：



（2）管理员可以上传、审核和管理图片，并对系统内的图片进行分析：



（3）对于个人用户，可将图片上传至私有空间进行批量管理、检索、编辑和分析，用作个人网盘、个人相册、作品集等：



（4）对于企业，可开通团队空间并邀请成员，共享图片并 **实时协同编辑图片**，提高团队协作效率。可用于提供商业服务，如企业活动相册、企业内部素材库等：






## 技术选型



### 后端



- Java Spring Boot 框架
- MySQL 数据库 + MyBatis-Plus 框架 + MyBatis X
- Redis 分布式缓存 + Caffeine 本地缓存
- Jsoup 数据抓取
-  COS 对象存储
-  ShardingSphere 分库分表
-  Sa-Token 权限控制
-  WebSocket 双向通信
-  AI 绘图大模型接入
-  多种设计模式的运用
-  多角度项目优化：性能、成本、安全性等

### 前端

- Vue 3 框架
- Vite 打包工具
- Ant Design Vue 组件库
- Axios 请求库
- Pinia 全局状态管理
- 其他组件：数据可视化、图片编辑等
-  前端工程化：ESLint + Prettier + TypeScript
-  OpenAPI 前端代码生成
