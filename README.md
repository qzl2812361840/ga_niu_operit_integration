# GaNiu × Operit AI 集成 — 开源部分

> 本仓库是**嘎妞（GaNiu）AI 手机助手**项目为满足 [LGPLv3](./LICENSE) 协议义务而**必须开源**的第三方代码集成部分。
>
> **本仓库不包含嘎妞任何自研代码**——只是嘎妞集成时用到的 Operit AI 原版文件（保持 100% 原样，仅顶部加了 LGPL 头部注释供追溯）。

---

## 关于嘎妞

嘎妞是一款商用 Android AI 语音助手 App：
- 二十四小时语音助手 · Agent 远程遥控手机 · 多会员等级
- 版权归属：**山东聪明头脑科技有限公司**
- 官方网站：http://www.ganiu.我爱你

嘎妞主体（UI、业务、账户、后端、语音策略等）为**商业闭源软件**，不在本仓库范围。

---

## 集成的 Operit AI 组件（100% 原版）

### Kotlin 源码

| 文件 | 来源 | 用途 |
|------|------|------|
| `services/TermuxCommandResultService.kt` | [Operit/services/TermuxCommandResultService.kt](https://github.com/AAswordman/Operit/blob/main/app/src/main/java/com/ai/assistance/operit/services/TermuxCommandResultService.kt) | Termux 命令结果广播回调 |
| `util/ripgrep/NativeRipgrep.kt` | [Operit/util/ripgrep/NativeRipgrep.kt](https://github.com/AAswordman/Operit/blob/main/app/src/main/java/com/ai/assistance/operit/util/ripgrep/NativeRipgrep.kt) | ripgrep JNI 封装 |

两个文件均**保留 Operit 原始 package `com.ai.assistance.operit.*`**，与上游 100% 一致（仅顶部加 LGPL 头部注释）。

### 资源文件

| 目录 | 来源 | 内容 |
|------|------|------|
| `assets/operit/mcp_bridge/` | [Operit/tools/mcp_bridge/](https://github.com/AAswordman/Operit/tree/main/tools/mcp_bridge) | MCP TCP 桥接（TypeScript） |
| `assets/operit/github/` | [Operit/tools/github/](https://github.com/AAswordman/Operit/tree/main/tools/github) | AI commit / issues / anthropic-skills 工具（Python） |
| `assets/operit/shower/shower-server.jar` | [Operit/showerclient/assets/shower-server.jar](https://github.com/AAswordman/Operit/tree/main/showerclient/src/main/assets) | Shower 投屏客户端 |

所有 assets 文件 **md5 与上游 100% 相同**，未做任何修改。

### 动态链接库（.so，未包含）

以下 `.so` 库通过 JNI 动态调用，**未修改源码**，按 LGPLv3 §4 属于"仅动态链接"，可在嘎妞商业闭源部分保留：

- `liboperit_ripgrep.so` — ripgrep native binding
- `libsherpa-mnn-jni.so` — 阿里 MNN 本地推理
- 其他：QuickJS / DragonBones / FBX / MMD / streamnative

如需完整源码，请访问 Operit 上游：https://github.com/AAswordman/Operit

---

## 嘎妞自研部分（**不**在本仓库）

- Flutter UI（`lib/`）
- FastAPI 后端服务（PostgreSQL + Redis + 会员/账户/计费）
- 语音识别/合成的业务策略（防循环、打断、TTS 队列）
- Hermes Agent 集成层
- 官网、管理后台
- 所有嘎妞品牌相关的资源和文案

以上均归山东聪明头脑科技有限公司所有，为商业闭源软件，不受 LGPLv3 约束。

---

## 合规声明

- 详细集成方式：[OPERIT_LICENSE.md](./OPERIT_LICENSE.md)
- 完整协议文本：[LICENSE (LGPLv3)](./LICENSE)
- Operit 上游：https://github.com/AAswordman/Operit

按 LGPLv3 §4，动态链接（`.so` JNI 调用）不视为衍生作品，嘎妞主体可保持闭源。本仓库公开静态集成到 APK 中的 Operit 原版文件以履行 §2 要求。

---

## 联系方式

- 客服邮箱：qzl2812361840z@163.com
- 版权方：山东聪明头脑科技有限公司

## 致谢

感谢 [AAswordman](https://github.com/AAswordman) 及 Operit AI 项目所有贡献者。
