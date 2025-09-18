package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: Io0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0687Io0 {
    void a(Bundle bundle);

    void b(int i, C6218oB c6218oB, long j, int i2);

    void c(int i, int i2, int i3, long j);

    boolean d(C1466So0 c1466So0);

    MediaFormat f();

    void flush();

    void j(int i, long j);

    int k();

    void l(C3272cp0 c3272cp0, Handler handler);

    int m(MediaCodec.BufferInfo bufferInfo);

    void o(int i, boolean z);

    void q(int i);

    void release();

    ByteBuffer t(int i);

    void u(Surface surface);

    ByteBuffer v(int i);
}
