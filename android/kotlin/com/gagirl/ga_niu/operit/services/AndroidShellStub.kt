/*
 * Adapted from Operit AI (https://github.com/AAswordman/Operit)
 * Original license: LGPLv3
 *
 * This file is part of the GaNiu × Operit AI integration.
 * GaNiu main app is a proprietary commercial software; only these
 * integrated files are published under LGPLv3 to fulfill license terms.
 *
 * Copyright (C) 2026 山东聪明头脑科技有限公司
 * Copyright (C) 2024-2026 Operit AI contributors
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 */

package com.gagirl.ga_niu.operit.services

data class CommandResult(
    val success: Boolean = false,
    val stdout: String = "",
    val stderr: String = "",
    val exitCode: Int = -1
)
