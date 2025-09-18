package com.facebook.crypto.mac;

import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.proguard.annotations.DoNotStrip;
import com.facebook.crypto.util.Assertions;
import com.facebook.crypto.util.NativeCryptoLibrary;
import java.io.IOException;

@DoNotStrip
/* loaded from: classes.dex */
public class NativeMac {
    public static final String FAILURE = "Failure";
    public static final int KEY_LENGTH = 64;
    private static final String MAC_ALREADY_INIT = "Mac has already been initialized";
    private static final String MAC_NOT_FINALIZED = "Mac has not been finalized";
    private static final String MAC_NOT_INIT = "Mac has not been initialized";

    @DoNotStrip
    private long mCtxPtr;
    private STATE mCurrentState = STATE.UNINITIALIZED;
    private final NativeCryptoLibrary mNativeCryptoLibrary;

    public enum STATE {
        UNINITIALIZED,
        INITIALIZED,
        FINALIZED
    }

    public NativeMac(NativeCryptoLibrary nativeCryptoLibrary) {
        this.mNativeCryptoLibrary = nativeCryptoLibrary;
    }

    private native int nativeDestroy();

    private native byte[] nativeDoFinal();

    private static native int nativeFailure();

    private native int nativeGetMacLength();

    private native int nativeInit(byte[] bArr, int i);

    private native int nativeUpdate(byte b);

    private native int nativeUpdate(byte[] bArr, int i, int i2);

    public void destroy() throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.FINALIZED, MAC_NOT_FINALIZED);
        if (nativeDestroy() == nativeFailure()) {
            throw new IOException("Failure");
        }
        this.mCurrentState = STATE.UNINITIALIZED;
    }

    public byte[] doFinal() throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.INITIALIZED, MAC_NOT_INIT);
        this.mCurrentState = STATE.FINALIZED;
        byte[] bArrNativeDoFinal = nativeDoFinal();
        if (bArrNativeDoFinal != null) {
            return bArrNativeDoFinal;
        }
        throw new IOException("Failure");
    }

    public int getMacLength() {
        return nativeGetMacLength();
    }

    public void init(byte[] bArr, int i) throws CryptoInitializationException, IOException {
        Assertions.checkState(this.mCurrentState == STATE.UNINITIALIZED, MAC_ALREADY_INIT);
        this.mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeInit(bArr, i) == nativeFailure()) {
            throw new IOException("Failure");
        }
        this.mCurrentState = STATE.INITIALIZED;
    }

    public void update(byte b) throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.INITIALIZED, MAC_NOT_INIT);
        if (nativeUpdate(b) == nativeFailure()) {
            throw new IOException("Failure");
        }
    }

    public void update(byte[] bArr, int i, int i2) throws IOException {
        Assertions.checkState(this.mCurrentState == STATE.INITIALIZED, MAC_NOT_INIT);
        if (nativeUpdate(bArr, i, i2) == nativeFailure()) {
            throw new IOException("Failure");
        }
    }
}
