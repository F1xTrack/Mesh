package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface VN extends AutoCloseable {
    MediaCodec.BufferInfo C();

    boolean G();

    ByteBuffer Q();

    long Y();

    long size();
}
