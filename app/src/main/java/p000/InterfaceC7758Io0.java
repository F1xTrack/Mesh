package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: Io0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7758Io0 {
    /* renamed from: a */
    void mo4007a(Bundle bundle);

    /* renamed from: b */
    void mo4008b(int i, C6536oB c6536oB, long j, int i2);

    /* renamed from: c */
    void mo4009c(int i, int i2, int i3, long j);

    /* renamed from: d */
    boolean mo4010d(C8278So0 c8278So0);

    /* renamed from: f */
    MediaFormat mo4011f();

    void flush();

    /* renamed from: j */
    void mo4012j(int i, long j);

    /* renamed from: k */
    int mo4013k();

    /* renamed from: l */
    void mo4014l(C9033cp0 c9033cp0, Handler handler);

    /* renamed from: m */
    int mo4015m(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: o */
    void mo4016o(int i, boolean z);

    /* renamed from: q */
    void mo4017q(int i);

    void release();

    /* renamed from: t */
    ByteBuffer mo4018t(int i);

    /* renamed from: u */
    void mo4019u(Surface surface);

    /* renamed from: v */
    ByteBuffer mo4020v(int i);
}
