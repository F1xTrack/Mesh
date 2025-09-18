package io.legere.pdfiumandroid;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m22266d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m22267d2 = {"Lio/legere/pdfiumandroid/PdfPasswordException;", "Ljava/io/IOException;", "msg", "", "<init>", "(Ljava/lang/String;)V", "pdfiumandroid_release"}, m22268k = 1, m22269mv = {2, 0, 0}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class PdfPasswordException extends IOException {
    public PdfPasswordException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PdfPasswordException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public PdfPasswordException(String str) {
        super(str);
    }
}
