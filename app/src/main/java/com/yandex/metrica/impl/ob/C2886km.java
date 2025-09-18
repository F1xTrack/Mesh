package com.yandex.metrica.impl.ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: com.yandex.metrica.impl.ob.km, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2886km {
    private final C2712dm a;

    public C2886km(C2712dm c2712dm) {
        this.a = c2712dm;
    }

    public int a(TextView textView) {
        int length = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String string = textView.getText().toString();
            Layout layout = textView.getLayout();
            length = string.length();
            if (layout == null) {
                return length;
            }
            int lineCount = textView.getLineCount() - 1;
            TextUtils.TruncateAt ellipsize = textView.getEllipsize();
            if (ellipsize == null || lineCount < 0) {
                return length;
            }
            if (lineCount != 0 && ellipsize != TextUtils.TruncateAt.END) {
                return length;
            }
            return length - layout.getEllipsisCount(lineCount);
        } catch (Throwable th) {
            this.a.a("ui_parsing_visibility", th);
            return length;
        }
    }
}
