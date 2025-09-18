package com.yandex.runtime.attestation;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes2.dex */
public class EcPublicKey implements Serializable {
    private byte[] affineX;
    private boolean affineX__is_initialized;
    private byte[] affineY;
    private boolean affineY__is_initialized;
    private NativeObject nativeObject;

    public EcPublicKey() {
        this.affineX__is_initialized = false;
        this.affineY__is_initialized = false;
    }

    private native byte[] getAffineX__Native();

    private native byte[] getAffineY__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::attestation::EcPublicKey";
    }

    private native NativeObject init(byte[] bArr, byte[] bArr2);

    public synchronized byte[] getAffineX() {
        try {
            if (!this.affineX__is_initialized) {
                this.affineX = getAffineX__Native();
                this.affineX__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.affineX;
    }

    public synchronized byte[] getAffineY() {
        try {
            if (!this.affineY__is_initialized) {
                this.affineY = getAffineY__Native();
                this.affineY__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.affineY;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getAffineX(), false);
            archive.add(getAffineY(), false);
            return;
        }
        this.affineX = archive.add(this.affineX, false);
        this.affineX__is_initialized = true;
        byte[] bArrAdd = archive.add(this.affineY, false);
        this.affineY = bArrAdd;
        this.affineY__is_initialized = true;
        this.nativeObject = init(this.affineX, bArrAdd);
    }

    public EcPublicKey(byte[] bArr, byte[] bArr2) {
        this.affineX__is_initialized = false;
        this.affineY__is_initialized = false;
        if (bArr == null) {
            throw new IllegalArgumentException("Required field \"affineX\" cannot be null");
        }
        if (bArr2 != null) {
            this.nativeObject = init(bArr, bArr2);
            this.affineX = bArr;
            this.affineX__is_initialized = true;
            this.affineY = bArr2;
            this.affineY__is_initialized = true;
            return;
        }
        throw new IllegalArgumentException("Required field \"affineY\" cannot be null");
    }

    private EcPublicKey(NativeObject nativeObject) {
        this.affineX__is_initialized = false;
        this.affineY__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
