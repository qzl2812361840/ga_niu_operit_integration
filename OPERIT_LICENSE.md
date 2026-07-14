# Operit AI 集成声明

本软件（嘎妞 GaNiu）集成了 [Operit AI](https://github.com/AAswordman/Operit) 的部分代码，遵循 LGPLv3 协议。

## 集成方式

### 1. 静态集成（本仓库公开的部分）
按 LGPLv3 §2 要求开源：
- **Kotlin 源码**：`services/TermuxCommandResultService.kt`, `util/ripgrep/NativeRipgrep.kt` — 保留 Operit 原始 `com.ai.assistance.operit.*` package，100% 原版
- **资源文件**：`assets/operit/{mcp_bridge, github, shower}` — 100% 原版，未修改

### 2. 动态链接（.so，按 §4 无需开源）
- `liboperit_ripgrep.so`
- `libsherpa-mnn-jni.so`
- 其他 .so 库通过 JNI 调用，未修改源码

## LGPLv3 合规

- 修改过的 Operit 代码 → 全部开源（本仓库）
- 未修改的 Operit 代码 → 保留原有许可证（本仓库）
- 嘎妞自研代码 → 闭源商业软件，不受 LGPLv3 约束
- 用户可通过本仓库或上游获取所集成的 Operit 源码

## 完整源码

上游项目：https://github.com/AAswordman/Operit

最后更新：2026-07-14
