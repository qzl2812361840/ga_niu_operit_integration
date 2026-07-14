# GaNiu × Operit AI 集成开源部分

> 本仓库是**嘎妞（GaNiu）AI 手机助手**项目中，为满足 [LGPLv3](./LICENSE) 协议义务而**必须开源**的第三方代码集成部分。
>
> 嘎妞主体（UI、业务逻辑、账户系统、后端服务、语音识别策略等）为商业闭源软件，未在本仓库公开。

---

## 关于嘎妞（GaNiu）

嘎妞是一款商用 Android AI 语音助手 App，主要功能：
- 二十四小时语音助手 · Agent 远程遥控手机 · 多会员等级
- 版权归属：**山东聪明头脑科技有限公司**
- 官方网站：http://www.ganiu.我爱你

---

## 集成的 Operit AI 组件

嘎妞集成了 [Operit AI](https://github.com/AAswordman/Operit)（LGPLv3 协议）的部分组件。按 LGPLv3 要求，**修改或分发的部分必须开源**。以下是本仓库公开的全部内容：

### 一、Kotlin 源码（LGPLv3）

`android/kotlin/com/gagirl/ga_niu/operit/`

| 文件 | 用途 | 是否修改 |
|------|------|----------|
| `services/TermuxCommandResultService.kt` | Termux 命令结果广播接收服务 | 改造 package 名 + 适配嘎妞回调 |
| `services/FloatingChatStub.kt` | 悬浮聊天窗口占位 | Stub 存根，未实际使用 |
| `services/AndroidShellStub.kt` | ADB Shell 调用占位 | Stub 存根，未实际使用 |
| `util/ripgrep/NativeRipgrep.kt` | ripgrep JNI 调用封装 | 未修改 |
| `util/AppLogger.kt` | 统一日志入口 | 未修改 |

### 二、资源文件

`android/assets/operit/`

| 目录 | 内容 | 协议 |
|------|------|------|
| `mcp_bridge/` | MCP（Model Context Protocol）桥接 TypeScript 脚本 | 遵循原项目协议 |
| `github/` | GitHub AI 提交、Issue 管理、Anthropic Skills 导入 Python 脚本 | 遵循原项目协议 |
| `shower/shower-server.jar` | Shower 投屏客户端 JAR | 遵循原项目协议 |

### 三、动态链接库（.so，未包含）

以下 `.so` 库通过 JNI 动态调用，**未修改源码**，按 LGPLv3 属于"仅动态链接"，可闭源：

- `liboperit_ripgrep.so` — ripgrep native binding
- `libsherpa-mnn-jni.so` — 阿里 MNN 本地推理
- 其他：QuickJS / DragonBones / FBX / MMD / streamnative（待编译集成）

如需完整源码，请访问：https://github.com/AAswordman/Operit

---

## 未开源的部分（嘎妞商业软件）

- App 主体 UI/Flutter 层（`lib/`）
- 后端服务（FastAPI + PostgreSQL + Redis）
- 语音识别/合成的业务策略（防循环、打断逻辑等）
- 账户、会员、计费、设备管理
- 官网、管理后台
- Hermes Agent 集成插件

嘎妞主体代码归山东聪明头脑科技有限公司所有，不受本 LGPLv3 仓库约束。

---

## 合规声明

- 详细说明：[OPERIT_LICENSE.md](./OPERIT_LICENSE.md)
- 完整许可证：[LICENSE (LGPLv3)](./LICENSE)
- 原项目地址：https://github.com/AAswordman/Operit

按 LGPLv3 §4，动态链接（.so JNI 调用）不视为衍生作品，嘎妞主体可保持闭源；本仓库公开修改过的 Kotlin 源码与静态集成的资源以履行 §2 要求。

---

## 联系方式

- 客服邮箱：qzl2812361840z@163.com
- 版权方：山东聪明头脑科技有限公司

## 致谢

感谢 [AAswordman](https://github.com/AAswordman) 及 Operit AI 项目所有贡献者。
