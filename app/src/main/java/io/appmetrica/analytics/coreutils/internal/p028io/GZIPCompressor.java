package io.appmetrica.analytics.coreutils.internal.p028io;

import io.appmetrica.analytics.coreapi.internal.p026io.Compressor;
import java.io.IOException;

/* loaded from: classes2.dex */
public class GZIPCompressor implements Compressor {
    @Override // io.appmetrica.analytics.coreapi.internal.p026io.Compressor
    public byte[] compress(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return GZIPUtils.gzipBytes(bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.p026io.Compressor
    public byte[] uncompress(byte[] bArr) throws IOException {
        if (bArr == null) {
            return null;
        }
        return GZIPUtils.unGzipBytes(bArr);
    }
}
