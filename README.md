# 七七智能云图库
## 项目介绍

基于Spring Boot+Redis+COS+MyBatis Plus的智能云图库平台。
用户可在平台公开上传和检索图片；管理员可以上传、审核和管理分析图片。同时为了使管理员快速丰富图片库，冷启动项目，可以批量从网上抓取并创建图片。 

（1）所有用户都可以在平台公开上传和检索图片素材，快速找到需要的图片。可用作表情包网站、设计素材网站、壁纸网站等：



（2）管理员可以上传、审核和管理图片，并对系统内的图片进行分析：






## 技术选型



### 后端



- Java Spring Boot 框架
- MySQL 数据库 + MyBatis-Plus 框架 + MyBatis X
- Redis 分布式缓存 + Caffeine 本地缓存
- Jsoup 数据抓取
- ⭐️ COS 对象存储
- ⭐️ 多种设计模式的运用
- ⭐️ 多角度项目优化：性能、成本、安全性等

### 前端

- Vue 3 框架
- Vite 打包工具
- Ant Design Vue 组件库
- Axios 请求库
- Pinia 全局状态管理
- 其他组件：数据可视化、图片编辑等
- ⭐️ 前端工程化：ESLint + Prettier + TypeScript
- ⭐️ OpenAPI 前端代码生成
