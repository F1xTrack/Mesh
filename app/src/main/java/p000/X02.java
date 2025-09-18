package p000;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public abstract class X02 {
    /* renamed from: a */
    public static boolean m8906a(C7000vF c7000vF) {
        C9591hA0 c9591hA0 = new C9591hA0(8);
        int i = C9407fk0.m18290b(c7000vF, c9591hA0).f27363a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        c7000vF.mo3620f(c9591hA0.f28293a, 0, 4, false);
        c9591hA0.m18741G(0);
        int iM18749g = c9591hA0.m18749g();
        if (iM18749g == 1463899717) {
            return true;
        }
        AbstractC10872rA1.m24171d("Unsupported form type: " + iM18749g);
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m8907b(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.X02.m8907b(java.lang.String):int");
    }

    /* renamed from: c */
    public static int m8908c(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* renamed from: d */
    public static C9407fk0 m8909d(int i, C7000vF c7000vF, C9591hA0 c9591hA0) throws C10103lA0, EOFException, InterruptedIOException {
        C9407fk0 c9407fk0M18290b = C9407fk0.m18290b(c7000vF, c9591hA0);
        while (true) {
            int i2 = c9407fk0M18290b.f27363a;
            if (i2 == i) {
                return c9407fk0M18290b;
            }
            AbstractC0852NX.m5767p("Ignoring unknown WAV chunk: ", i2);
            long j = c9407fk0M18290b.f27364b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw C10103lA0.m22368c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            c7000vF.mo3627n((int) j2);
            c9407fk0M18290b = C9407fk0.m18290b(c7000vF, c9591hA0);
        }
    }
}
