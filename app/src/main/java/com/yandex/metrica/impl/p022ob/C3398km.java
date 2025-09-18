package com.yandex.metrica.impl.p022ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

/* renamed from: com.yandex.metrica.impl.ob.km */
/* loaded from: classes2.dex */
public class C3398km {

    /* renamed from: a */
    private final C3216dm f24147a;

    public C3398km(C3216dm c3216dm) {
        this.f24147a = c3216dm;
    }

    /* renamed from: a */
    public int m16337a(TextView textView) {
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
            this.f24147a.m15805a("ui_parsing_visibility", th);
            return length;
        }
    }
}
