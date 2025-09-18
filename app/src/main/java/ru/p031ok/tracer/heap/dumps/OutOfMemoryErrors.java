package ru.p031ok.tracer.heap.dumps;

import kotlin.Metadata;
import p000.O90;

@Metadata(m22266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m22267d2 = {"isOom", "", "throwable", "", "tracer-heap-dumps_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class OutOfMemoryErrors {
    public static final boolean isOom(Throwable th) {
        O90.m5968f(th, "throwable");
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause == null || cause == th) {
                return false;
            }
            th = cause;
        }
        return true;
    }
}
