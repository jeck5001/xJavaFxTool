/**
 *    Copyright (c) [2019] [xufeng]
 *    [xJavaFxTool] is licensed under Mulan PSL v2.
 *    You can use this software according to the terms and conditions of the Mulan PSL v2.
 *    You may obtain a copy of Mulan PSL v2 at:
 *             http://license.coscl.org.cn/MulanPSL2
 *    THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 *    See the Mulan PSL v2 for more details.
 */
package com.xwintop.xJavaFxTool;

import com.xwintop.xJavaFxTool.utils.XJavaFxSystemUtil;
import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;

/**
 * 程序入口
 */
@Slf4j
public class XJavaFxToolMain {

    public static void main(String[] args) {
        XJavaFxSystemUtil.initSystemLocal();    // 初始化本地语言
        Application.launch(XJavaFxToolApplication.class, args);
    }
}
