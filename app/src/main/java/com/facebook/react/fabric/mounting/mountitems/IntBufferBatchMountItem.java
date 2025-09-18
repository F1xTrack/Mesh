package com.facebook.react.fabric.mounting.mountitems;

import android.os.Trace;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.MountingManager;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import p000.AbstractC10874rB1;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.G41;
import p000.InterfaceC0965PK;
import p000.MT1;

@InterfaceC0965PK
/* loaded from: classes.dex */
final class IntBufferBatchMountItem implements BatchMountItem {
    static final int INSTRUCTION_CREATE = 2;
    static final int INSTRUCTION_DELETE = 4;
    static final int INSTRUCTION_FLAG_MULTIPLE = 1;
    static final int INSTRUCTION_INSERT = 8;
    static final int INSTRUCTION_REMOVE = 16;
    static final int INSTRUCTION_REMOVE_DELETE_TREE = 2048;
    static final int INSTRUCTION_UPDATE_EVENT_EMITTER = 256;
    static final int INSTRUCTION_UPDATE_LAYOUT = 128;
    static final int INSTRUCTION_UPDATE_OVERFLOW_INSET = 1024;
    static final int INSTRUCTION_UPDATE_PADDING = 512;
    static final int INSTRUCTION_UPDATE_PROPS = 32;
    static final int INSTRUCTION_UPDATE_STATE = 64;
    static final String TAG = "IntBufferBatchMountItem";
    private final int mCommitNumber;
    private final int[] mIntBuffer;
    private final int mIntBufferLen;
    private final Object[] mObjBuffer;
    private final int mObjBufferLen;
    private final int mSurfaceId;

    public IntBufferBatchMountItem(int i, int[] iArr, Object[] objArr, int i2) {
        this.mSurfaceId = i;
        this.mCommitNumber = i2;
        this.mIntBuffer = iArr;
        this.mObjBuffer = objArr;
        this.mIntBufferLen = iArr.length;
        this.mObjBufferLen = objArr.length;
    }

    private static String nameForInstructionString(int i) {
        return i == 2 ? "CREATE" : i == 4 ? "DELETE" : i == 8 ? "INSERT" : i == 16 ? "REMOVE" : i == INSTRUCTION_REMOVE_DELETE_TREE ? "REMOVE_DELETE_TREE" : i == 32 ? "UPDATE_PROPS" : i == 64 ? "UPDATE_STATE" : i == INSTRUCTION_UPDATE_LAYOUT ? "UPDATE_LAYOUT" : i == INSTRUCTION_UPDATE_PADDING ? "UPDATE_PADDING" : i == INSTRUCTION_UPDATE_OVERFLOW_INSET ? "UPDATE_OVERFLOW_INSET" : i == INSTRUCTION_UPDATE_EVENT_EMITTER ? "UPDATE_EVENT_EMITTER" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public void execute(MountingManager mountingManager) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 8;
        int i10 = 0;
        SurfaceMountingManager surfaceManager = mountingManager.getSurfaceManager(this.mSurfaceId);
        if (surfaceManager == null) {
            AbstractC3929dS.m17673f(TAG, "Skipping batch of MountItems; no SurfaceMountingManager found for [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (surfaceManager.isStopped()) {
            AbstractC3929dS.m17673f(TAG, "Skipping batch of MountItems; was stopped [%d].", Integer.valueOf(this.mSurfaceId));
            return;
        }
        if (FabricUIManager.ENABLE_FABRIC_LOGS) {
            AbstractC3929dS.m17668a(Integer.valueOf(this.mSurfaceId), TAG, "Executing IntBufferBatchMountItem on surface [%d]");
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < this.mIntBufferLen) {
            int[] iArr = this.mIntBuffer;
            int i13 = i11 + 1;
            int i14 = iArr[i11];
            int i15 = i14 & (-2);
            if ((i14 & 1) != 0) {
                int i16 = iArr[i13];
                i13 = i11 + 2;
                i = i16;
            } else {
                i = 1;
            }
            MT1.m5371b("IntBufferBatchMountItem::mountInstructions::" + nameForInstructionString(i15));
            int i17 = i10;
            int i18 = i12;
            i11 = i13;
            while (i17 < i) {
                if (i15 == 2) {
                    String fabricComponentName = FabricNameComponentMapping.getFabricComponentName((String) this.mObjBuffer[i18]);
                    int[] iArr2 = this.mIntBuffer;
                    int i19 = iArr2[i11];
                    Object[] objArr = this.mObjBuffer;
                    ReadableMap readableMap = (ReadableMap) objArr[i18 + 1];
                    int i20 = i18 + 3;
                    G41 g41 = (G41) objArr[i18 + 2];
                    i18 += 4;
                    EventEmitterWrapper eventEmitterWrapper = (EventEmitterWrapper) objArr[i20];
                    i6 = i11 + 2;
                    i2 = i17;
                    surfaceManager.createView(fabricComponentName, i19, readableMap, g41, eventEmitterWrapper, iArr2[i11 + 1] == 1);
                    i3 = i;
                    i4 = i15;
                } else {
                    i2 = i17;
                    if (i15 == 4) {
                        surfaceManager.deleteView(this.mIntBuffer[i11]);
                        i11++;
                    } else if (i15 == i9) {
                        int[] iArr3 = this.mIntBuffer;
                        int i21 = iArr3[i11];
                        int i22 = i11 + 2;
                        int i23 = iArr3[i11 + 1];
                        i11 += 3;
                        surfaceManager.addViewAt(i23, i21, iArr3[i22]);
                    } else if (i15 == 16) {
                        int[] iArr4 = this.mIntBuffer;
                        int i24 = iArr4[i11];
                        int i25 = i11 + 2;
                        int i26 = iArr4[i11 + 1];
                        i11 += 3;
                        surfaceManager.removeViewAt(i24, i26, iArr4[i25]);
                    } else if (i15 == INSTRUCTION_REMOVE_DELETE_TREE) {
                        int[] iArr5 = this.mIntBuffer;
                        int i27 = iArr5[i11];
                        int i28 = i11 + 2;
                        int i29 = iArr5[i11 + 1];
                        i11 += 3;
                        surfaceManager.removeDeleteTreeAt(i27, i29, iArr5[i28]);
                    } else {
                        if (i15 == 32) {
                            i7 = i11 + 1;
                            i8 = i18 + 1;
                            surfaceManager.updateProps(this.mIntBuffer[i11], (ReadableMap) this.mObjBuffer[i18]);
                        } else if (i15 == 64) {
                            i7 = i11 + 1;
                            i8 = i18 + 1;
                            surfaceManager.updateState(this.mIntBuffer[i11], (G41) this.mObjBuffer[i18]);
                        } else if (i15 == INSTRUCTION_UPDATE_LAYOUT) {
                            int[] iArr6 = this.mIntBuffer;
                            int i30 = iArr6[i11];
                            int i31 = iArr6[i11 + 1];
                            int i32 = iArr6[i11 + 2];
                            int i33 = iArr6[i11 + 3];
                            int i34 = iArr6[i11 + 4];
                            int i35 = iArr6[i11 + 5];
                            i6 = i11 + 7;
                            int i36 = iArr6[i11 + 6];
                            if (AbstractC10874rB1.m24211b()) {
                                i3 = i;
                                i4 = i15;
                                surfaceManager.updateLayout(i30, i31, i32, i33, i34, i35, i36, this.mIntBuffer[i6]);
                                i6 = i11 + 8;
                            } else {
                                i3 = i;
                                i4 = i15;
                                surfaceManager.updateLayout(i30, i31, i32, i33, i34, i35, i36, 0);
                            }
                        } else {
                            i3 = i;
                            i4 = i15;
                            if (i4 == INSTRUCTION_UPDATE_PADDING) {
                                int[] iArr7 = this.mIntBuffer;
                                i5 = i11 + 5;
                                surfaceManager.updatePadding(iArr7[i11], iArr7[i11 + 1], iArr7[i11 + 2], iArr7[i11 + 3], iArr7[i11 + 4]);
                            } else if (i4 == INSTRUCTION_UPDATE_OVERFLOW_INSET) {
                                int[] iArr8 = this.mIntBuffer;
                                i5 = i11 + 5;
                                surfaceManager.updateOverflowInset(iArr8[i11], iArr8[i11 + 1], iArr8[i11 + 2], iArr8[i11 + 3], iArr8[i11 + 4]);
                            } else {
                                if (i4 != INSTRUCTION_UPDATE_EVENT_EMITTER) {
                                    throw new IllegalArgumentException(AbstractC7222ym.m26229f(i4, "Invalid type argument to IntBufferBatchMountItem: ", i11, " at index: "));
                                }
                                surfaceManager.updateEventEmitter(this.mIntBuffer[i11], (EventEmitterWrapper) this.mObjBuffer[i18]);
                                i11++;
                                i18++;
                                i17 = i2 + 1;
                                i15 = i4;
                                i = i3;
                                i9 = 8;
                            }
                            i11 = i5;
                            i17 = i2 + 1;
                            i15 = i4;
                            i = i3;
                            i9 = 8;
                        }
                        i11 = i7;
                        i18 = i8;
                    }
                    i3 = i;
                    i4 = i15;
                    i17 = i2 + 1;
                    i15 = i4;
                    i = i3;
                    i9 = 8;
                }
                i11 = i6;
                i17 = i2 + 1;
                i15 = i4;
                i = i3;
                i9 = 8;
            }
            Trace.endSection();
            i12 = i18;
            i9 = 8;
            i10 = 0;
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
    public int getSurfaceId() {
        return this.mSurfaceId;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.BatchMountItem
    public boolean isBatchEmpty() {
        return this.mIntBufferLen == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x031f A[LOOP:2: B:62:0x031b->B:64:0x031f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 837
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem.toString():java.lang.String");
    }
}
