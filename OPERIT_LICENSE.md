# Operit AI 集成声明

本软件集成了 [Operit AI](https://github.com/AAswordman/Operit) 的部分代码，遵循 LGPLv3 协议。

## 集成方式
- **动态链接(.so)**：llama, MNN, QuickJS, DragonBones, FBX, MMD, streamnative → 闭源安全
- **源码集成(Kotlin)**：services/, util/ripgrep/ → 按LGPLv3开源
- **资源集成**：mcp_bridge/, github/, shower-server.jar → 按各自协议

## LGPLv3 要求
- 未修改的Operit代码保持原有许可证
- 嘎妞商业代码闭源
- 用户可获取Operit源码：https://github.com/AAswordman/Operit

## 动态链接库(.so)
本应用使用了以下动态链接库，未修改源码，仅通过JNI调用：
- liboperit_ripgrep.so
- libsherpa-mnn-jni.so
（其他.so库待编译集成）

最后更新：2026-07-12
