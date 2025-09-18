package defpackage;

import android.app.PendingIntent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Ay1 */
/* loaded from: classes.dex */
public final class C0094Ay1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C0094Ay1(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                int i = 0;
                String strCreateString = null;
                String strCreateString2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header);
                    if (fieldId == 2) {
                        strCreateString = SafeParcelReader.createString(parcel, header);
                    } else if (fieldId == 3) {
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                    } else if (fieldId != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        i = SafeParcelReader.readInt(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                C7142t12 c7142t12 = new C7142t12();
                c7142t12.a = strCreateString;
                c7142t12.b = strCreateString2;
                c7142t12.c = i;
                return c7142t12;
            case 1:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                long j = 0;
                long j2 = 0;
                int i2 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header2);
                    if (fieldId2 == 1) {
                        j = SafeParcelReader.readLong(parcel, header2);
                    } else if (fieldId2 == 2) {
                        i2 = SafeParcelReader.readInt(parcel, header2);
                    } else if (fieldId2 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header2);
                    } else {
                        j2 = SafeParcelReader.readLong(parcel, header2);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new C6367oy1(i2, j, j2);
            case 2:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                int i3 = 0;
                boolean z = false;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header3);
                    if (fieldId3 == 2) {
                        i3 = SafeParcelReader.readInt(parcel, header3);
                    } else if (fieldId3 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header3);
                    } else {
                        z = SafeParcelReader.readBoolean(parcel, header3);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                C0562Gy1 c0562Gy1 = new C0562Gy1();
                c0562Gy1.a = i3;
                c0562Gy1.b = z;
                return c0562Gy1;
            case 3:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString3 = null;
                String strCreateString4 = null;
                C5337jZ1 c5337jZ1 = null;
                String strCreateString5 = null;
                C8316zB1 c8316zB1 = null;
                C8316zB1 c8316zB12 = null;
                C8316zB1 c8316zB13 = null;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                boolean z2 = false;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header4)) {
                        case 2:
                            strCreateString3 = SafeParcelReader.createString(parcel, header4);
                            break;
                        case 3:
                            strCreateString4 = SafeParcelReader.createString(parcel, header4);
                            break;
                        case 4:
                            c5337jZ1 = (C5337jZ1) SafeParcelReader.createParcelable(parcel, header4, C5337jZ1.CREATOR);
                            break;
                        case 5:
                            j3 = SafeParcelReader.readLong(parcel, header4);
                            break;
                        case 6:
                            z2 = SafeParcelReader.readBoolean(parcel, header4);
                            break;
                        case 7:
                            strCreateString5 = SafeParcelReader.createString(parcel, header4);
                            break;
                        case 8:
                            c8316zB1 = (C8316zB1) SafeParcelReader.createParcelable(parcel, header4, C8316zB1.CREATOR);
                            break;
                        case 9:
                            j4 = SafeParcelReader.readLong(parcel, header4);
                            break;
                        case 10:
                            c8316zB12 = (C8316zB1) SafeParcelReader.createParcelable(parcel, header4, C8316zB1.CREATOR);
                            break;
                        case 11:
                            j5 = SafeParcelReader.readLong(parcel, header4);
                            break;
                        case 12:
                            c8316zB13 = (C8316zB1) SafeParcelReader.createParcelable(parcel, header4, C8316zB1.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header4);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new C0406Ey1(strCreateString3, strCreateString4, c5337jZ1, j3, z2, strCreateString5, c8316zB1, j4, c8316zB12, j5, c8316zB13);
            case 4:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                String[] strArrCreateStringArray = null;
                int i4 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header5);
                    if (fieldId4 == 1) {
                        i4 = SafeParcelReader.readInt(parcel, header5);
                    } else if (fieldId4 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header5);
                    } else {
                        strArrCreateStringArray = SafeParcelReader.createStringArray(parcel, header5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new C6752qz1(i4, strArrCreateStringArray);
            case 5:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                long j6 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header6);
                    if (fieldId5 == 2) {
                        i5 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 == 3) {
                        i6 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 == 4) {
                        i7 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId5 == 5) {
                        j6 = SafeParcelReader.readLong(parcel, header6);
                    } else if (fieldId5 != 6) {
                        SafeParcelReader.skipUnknownField(parcel, header6);
                    } else {
                        i8 = SafeParcelReader.readInt(parcel, header6);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new C7896wz1(i5, i6, j6, i7, i8);
            case 6:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundleCreateBundle = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header7) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header7);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header7);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                return new C0721Iz1(bundleCreateBundle);
            case 7:
                int iValidateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString6 = null;
                String strCreateString7 = null;
                byte[] bArrCreateByteArray = null;
                Point[] pointArr = null;
                C1422Rz1 c1422Rz1 = null;
                C4104hA1 c4104hA1 = null;
                C5835mA1 c5835mA1 = null;
                C7171tA1 c7171tA1 = null;
                C6599qA1 c6599qA1 = null;
                C1890Xz1 c1890Xz1 = null;
                C0097Az1 c0097Az1 = null;
                C0487Fz1 c0487Fz1 = null;
                C1032Mz1 c1032Mz1 = null;
                int i9 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader8) {
                    int header8 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header8)) {
                        case 1:
                            i9 = SafeParcelReader.readInt(parcel, header8);
                            break;
                        case 2:
                            strCreateString6 = SafeParcelReader.createString(parcel, header8);
                            break;
                        case 3:
                            strCreateString7 = SafeParcelReader.createString(parcel, header8);
                            break;
                        case 4:
                            bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header8);
                            break;
                        case 5:
                            pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, header8, Point.CREATOR);
                            break;
                        case 6:
                            i10 = SafeParcelReader.readInt(parcel, header8);
                            break;
                        case 7:
                            c1422Rz1 = (C1422Rz1) SafeParcelReader.createParcelable(parcel, header8, C1422Rz1.CREATOR);
                            break;
                        case 8:
                            c4104hA1 = (C4104hA1) SafeParcelReader.createParcelable(parcel, header8, C4104hA1.CREATOR);
                            break;
                        case 9:
                            c5835mA1 = (C5835mA1) SafeParcelReader.createParcelable(parcel, header8, C5835mA1.CREATOR);
                            break;
                        case 10:
                            c7171tA1 = (C7171tA1) SafeParcelReader.createParcelable(parcel, header8, C7171tA1.CREATOR);
                            break;
                        case 11:
                            c6599qA1 = (C6599qA1) SafeParcelReader.createParcelable(parcel, header8, C6599qA1.CREATOR);
                            break;
                        case 12:
                            c1890Xz1 = (C1890Xz1) SafeParcelReader.createParcelable(parcel, header8, C1890Xz1.CREATOR);
                            break;
                        case 13:
                            c0097Az1 = (C0097Az1) SafeParcelReader.createParcelable(parcel, header8, C0097Az1.CREATOR);
                            break;
                        case 14:
                            c0487Fz1 = (C0487Fz1) SafeParcelReader.createParcelable(parcel, header8, C0487Fz1.CREATOR);
                            break;
                        case 15:
                            c1032Mz1 = (C1032Mz1) SafeParcelReader.createParcelable(parcel, header8, C1032Mz1.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header8);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader8);
                return new C7553vA1(i9, strCreateString6, strCreateString7, bArrCreateByteArray, pointArr, i10, c1422Rz1, c4104hA1, c5835mA1, c7171tA1, c6599qA1, c1890Xz1, c0097Az1, c0487Fz1, c1032Mz1);
            case 8:
                return new C1026Mx1((PendingIntent) parcel.readParcelable(AbstractC4351iT0.class.getClassLoader()), parcel.readInt() != 0);
            case 9:
                return new C6801rE1(parcel.readStrongBinder());
            case 10:
                int iValidateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString8 = null;
                String strCreateString9 = null;
                while (parcel.dataPosition() < iValidateObjectHeader9) {
                    int header9 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(header9);
                    if (fieldId6 == 1) {
                        strCreateString8 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId6 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header9);
                    } else {
                        strCreateString9 = SafeParcelReader.createString(parcel, header9);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader9);
                return new C1806Wx1(strCreateString8, strCreateString9);
            case 11:
                int iValidateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                int i11 = 0;
                boolean z3 = false;
                while (parcel.dataPosition() < iValidateObjectHeader10) {
                    int header10 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(header10);
                    if (fieldId7 == 1) {
                        i11 = SafeParcelReader.readInt(parcel, header10);
                    } else if (fieldId7 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header10);
                    } else {
                        z3 = SafeParcelReader.readBoolean(parcel, header10);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader10);
                return new RA1(i11, z3);
            case 12:
                int iValidateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z4 = false;
                C3347dC1 c3347dC1 = null;
                C5459kC1 c5459kC1 = null;
                while (parcel.dataPosition() < iValidateObjectHeader11) {
                    int header11 = SafeParcelReader.readHeader(parcel);
                    int fieldId8 = SafeParcelReader.getFieldId(header11);
                    if (fieldId8 == 1) {
                        c3347dC1 = (C3347dC1) SafeParcelReader.createParcelable(parcel, header11, C3347dC1.CREATOR);
                    } else if (fieldId8 == 2) {
                        c5459kC1 = (C5459kC1) SafeParcelReader.createParcelable(parcel, header11, C5459kC1.CREATOR);
                    } else if (fieldId8 == 3) {
                        SafeParcelReader.readBoolean(parcel, header11);
                    } else if (fieldId8 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header11);
                    } else {
                        z4 = SafeParcelReader.readBoolean(parcel, header11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader11);
                return new WA1(c3347dC1, c5459kC1, z4);
            case 13:
                int iValidateObjectHeader12 = SafeParcelReader.validateObjectHeader(parcel);
                VB1 vb1 = null;
                while (parcel.dataPosition() < iValidateObjectHeader12) {
                    int header12 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header12) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header12);
                    } else {
                        vb1 = (VB1) SafeParcelReader.createParcelable(parcel, header12, VB1.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader12);
                return new C3344dB1(vb1);
            case 14:
                int iValidateObjectHeader13 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString10 = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                boolean z5 = false;
                while (parcel.dataPosition() < iValidateObjectHeader13) {
                    int header13 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header13)) {
                        case 1:
                            i12 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 2:
                            i13 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 3:
                            i14 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 4:
                            i15 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 5:
                            i16 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 6:
                            i17 = SafeParcelReader.readInt(parcel, header13);
                            break;
                        case 7:
                            z5 = SafeParcelReader.readBoolean(parcel, header13);
                            break;
                        case 8:
                            strCreateString10 = SafeParcelReader.createString(parcel, header13);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header13);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader13);
                return new C8086xz1(i12, i13, i14, i15, i16, i17, z5, strCreateString10);
            case 15:
                int iValidateObjectHeader14 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString11 = null;
                String strCreateString12 = null;
                String strCreateString13 = null;
                String strCreateString14 = null;
                String strCreateString15 = null;
                C8086xz1 c8086xz1 = null;
                C8086xz1 c8086xz12 = null;
                while (parcel.dataPosition() < iValidateObjectHeader14) {
                    int header14 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header14)) {
                        case 1:
                            strCreateString11 = SafeParcelReader.createString(parcel, header14);
                            break;
                        case 2:
                            strCreateString12 = SafeParcelReader.createString(parcel, header14);
                            break;
                        case 3:
                            strCreateString13 = SafeParcelReader.createString(parcel, header14);
                            break;
                        case 4:
                            strCreateString14 = SafeParcelReader.createString(parcel, header14);
                            break;
                        case 5:
                            strCreateString15 = SafeParcelReader.createString(parcel, header14);
                            break;
                        case 6:
                            c8086xz1 = (C8086xz1) SafeParcelReader.createParcelable(parcel, header14, C8086xz1.CREATOR);
                            break;
                        case 7:
                            c8086xz12 = (C8086xz1) SafeParcelReader.createParcelable(parcel, header14, C8086xz1.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header14);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader14);
                return new C0097Az1(strCreateString11, strCreateString12, strCreateString13, strCreateString14, strCreateString15, c8086xz1, c8086xz12);
            case 16:
                int iValidateObjectHeader15 = SafeParcelReader.validateObjectHeader(parcel);
                C2465cA1 c2465cA1 = null;
                String strCreateString16 = null;
                String strCreateString17 = null;
                C4104hA1[] c4104hA1Arr = null;
                C1422Rz1[] c1422Rz1Arr = null;
                String[] strArrCreateStringArray2 = null;
                C6752qz1[] c6752qz1Arr = null;
                while (parcel.dataPosition() < iValidateObjectHeader15) {
                    int header15 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header15)) {
                        case 1:
                            c2465cA1 = (C2465cA1) SafeParcelReader.createParcelable(parcel, header15, C2465cA1.CREATOR);
                            break;
                        case 2:
                            strCreateString16 = SafeParcelReader.createString(parcel, header15);
                            break;
                        case 3:
                            strCreateString17 = SafeParcelReader.createString(parcel, header15);
                            break;
                        case 4:
                            c4104hA1Arr = (C4104hA1[]) SafeParcelReader.createTypedArray(parcel, header15, C4104hA1.CREATOR);
                            break;
                        case 5:
                            c1422Rz1Arr = (C1422Rz1[]) SafeParcelReader.createTypedArray(parcel, header15, C1422Rz1.CREATOR);
                            break;
                        case 6:
                            strArrCreateStringArray2 = SafeParcelReader.createStringArray(parcel, header15);
                            break;
                        case 7:
                            c6752qz1Arr = (C6752qz1[]) SafeParcelReader.createTypedArray(parcel, header15, C6752qz1.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header15);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader15);
                return new C0487Fz1(c2465cA1, strCreateString16, strCreateString17, c4104hA1Arr, c1422Rz1Arr, strArrCreateStringArray2, c6752qz1Arr);
            case 17:
                int iValidateObjectHeader16 = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundleCreateBundle2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader16) {
                    int header16 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header16) != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header16);
                    } else {
                        bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header16);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader16);
                return new C6029nB1(bundleCreateBundle2);
            case 18:
                int iValidateObjectHeader17 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString18 = null;
                String strCreateString19 = null;
                String strCreateString20 = null;
                String strCreateString21 = null;
                String strCreateString22 = null;
                String strCreateString23 = null;
                String strCreateString24 = null;
                String strCreateString25 = null;
                String strCreateString26 = null;
                String strCreateString27 = null;
                String strCreateString28 = null;
                String strCreateString29 = null;
                String strCreateString30 = null;
                String strCreateString31 = null;
                while (parcel.dataPosition() < iValidateObjectHeader17) {
                    int header17 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header17)) {
                        case 1:
                            strCreateString18 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 2:
                            strCreateString19 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 3:
                            strCreateString20 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 4:
                            strCreateString21 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 5:
                            strCreateString22 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 6:
                            strCreateString23 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 7:
                            strCreateString24 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 8:
                            strCreateString25 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 9:
                            strCreateString26 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 10:
                            strCreateString27 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 11:
                            strCreateString28 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 12:
                            strCreateString29 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 13:
                            strCreateString30 = SafeParcelReader.createString(parcel, header17);
                            break;
                        case 14:
                            strCreateString31 = SafeParcelReader.createString(parcel, header17);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header17);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader17);
                return new C1032Mz1(strCreateString18, strCreateString19, strCreateString20, strCreateString21, strCreateString22, strCreateString23, strCreateString24, strCreateString25, strCreateString26, strCreateString27, strCreateString28, strCreateString29, strCreateString30, strCreateString31);
            case 19:
                int iValidateObjectHeader18 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString32 = null;
                String strCreateString33 = null;
                int i18 = 0;
                String strCreateString34 = null;
                while (parcel.dataPosition() < iValidateObjectHeader18) {
                    int header18 = SafeParcelReader.readHeader(parcel);
                    int fieldId9 = SafeParcelReader.getFieldId(header18);
                    if (fieldId9 == 1) {
                        i18 = SafeParcelReader.readInt(parcel, header18);
                    } else if (fieldId9 == 2) {
                        strCreateString32 = SafeParcelReader.createString(parcel, header18);
                    } else if (fieldId9 == 3) {
                        strCreateString34 = SafeParcelReader.createString(parcel, header18);
                    } else if (fieldId9 != 4) {
                        SafeParcelReader.skipUnknownField(parcel, header18);
                    } else {
                        strCreateString33 = SafeParcelReader.createString(parcel, header18);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader18);
                return new C1422Rz1(strCreateString32, i18, strCreateString34, strCreateString33);
            case 20:
                int iValidateObjectHeader19 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString35 = null;
                C6029nB1 c6029nB1 = null;
                String strCreateString36 = null;
                long j7 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader19) {
                    int header19 = SafeParcelReader.readHeader(parcel);
                    int fieldId10 = SafeParcelReader.getFieldId(header19);
                    if (fieldId10 == 2) {
                        strCreateString35 = SafeParcelReader.createString(parcel, header19);
                    } else if (fieldId10 == 3) {
                        c6029nB1 = (C6029nB1) SafeParcelReader.createParcelable(parcel, header19, C6029nB1.CREATOR);
                    } else if (fieldId10 == 4) {
                        strCreateString36 = SafeParcelReader.createString(parcel, header19);
                    } else if (fieldId10 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header19);
                    } else {
                        j7 = SafeParcelReader.readLong(parcel, header19);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader19);
                return new C8316zB1(strCreateString35, c6029nB1, strCreateString36, j7);
            case 21:
                int iValidateObjectHeader20 = SafeParcelReader.validateObjectHeader(parcel);
                double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
                double d2 = 0.0d;
                while (parcel.dataPosition() < iValidateObjectHeader20) {
                    int header20 = SafeParcelReader.readHeader(parcel);
                    int fieldId11 = SafeParcelReader.getFieldId(header20);
                    if (fieldId11 == 1) {
                        d = SafeParcelReader.readDouble(parcel, header20);
                    } else if (fieldId11 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header20);
                    } else {
                        d2 = SafeParcelReader.readDouble(parcel, header20);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader20);
                return new C1890Xz1(d, d2);
            case 22:
                int iValidateObjectHeader21 = SafeParcelReader.validateObjectHeader(parcel);
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                float f = 0.0f;
                byte[] bArrCreateByteArray2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader21) {
                    int header21 = SafeParcelReader.readHeader(parcel);
                    int fieldId12 = SafeParcelReader.getFieldId(header21);
                    if (fieldId12 == 1) {
                        z6 = SafeParcelReader.readBoolean(parcel, header21);
                    } else if (fieldId12 == 2) {
                        bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header21);
                    } else if (fieldId12 == 3) {
                        z7 = SafeParcelReader.readBoolean(parcel, header21);
                    } else if (fieldId12 == 4) {
                        f = SafeParcelReader.readFloat(parcel, header21);
                    } else if (fieldId12 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header21);
                    } else {
                        z8 = SafeParcelReader.readBoolean(parcel, header21);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader21);
                return new VB1(z6, bArrCreateByteArray2, z7, f, z8);
            case 23:
                int iValidateObjectHeader22 = SafeParcelReader.validateObjectHeader(parcel);
                int i19 = 0;
                float[] fArrCreateFloatArray = null;
                boolean z9 = false;
                while (parcel.dataPosition() < iValidateObjectHeader22) {
                    int header22 = SafeParcelReader.readHeader(parcel);
                    int fieldId13 = SafeParcelReader.getFieldId(header22);
                    if (fieldId13 == 1) {
                        fArrCreateFloatArray = SafeParcelReader.createFloatArray(parcel, header22);
                    } else if (fieldId13 == 2) {
                        i19 = SafeParcelReader.readInt(parcel, header22);
                    } else if (fieldId13 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header22);
                    } else {
                        z9 = SafeParcelReader.readBoolean(parcel, header22);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader22);
                return new C3347dC1(fArrCreateFloatArray, i19, z9);
            case 24:
                int iValidateObjectHeader23 = SafeParcelReader.validateObjectHeader(parcel);
                float[] fArrCreateFloatArray2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader23) {
                    int header23 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header23) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header23);
                    } else {
                        fArrCreateFloatArray2 = SafeParcelReader.createFloatArray(parcel, header23);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader23);
                return new C5459kC1(fArrCreateFloatArray2);
            case 25:
                int iValidateObjectHeader24 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString37 = null;
                String strCreateString38 = null;
                String strCreateString39 = null;
                String strCreateString40 = null;
                String strCreateString41 = null;
                String strCreateString42 = null;
                String strCreateString43 = null;
                while (parcel.dataPosition() < iValidateObjectHeader24) {
                    int header24 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header24)) {
                        case 1:
                            strCreateString37 = SafeParcelReader.createString(parcel, header24);
                            break;
                        case 2:
                            strCreateString38 = SafeParcelReader.createString(parcel, header24);
                            break;
                        case 3:
                            strCreateString39 = SafeParcelReader.createString(parcel, header24);
                            break;
                        case 4:
                            strCreateString40 = SafeParcelReader.createString(parcel, header24);
                            break;
                        case 5:
                            strCreateString41 = SafeParcelReader.createString(parcel, header24);
                            break;
                        case 6:
                            strCreateString42 = SafeParcelReader.createString(parcel, header24);
                            break;
                        case 7:
                            strCreateString43 = SafeParcelReader.createString(parcel, header24);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header24);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader24);
                return new C2465cA1(strCreateString37, strCreateString38, strCreateString39, strCreateString40, strCreateString41, strCreateString42, strCreateString43);
            case 26:
                int iValidateObjectHeader25 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString44 = null;
                int i20 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader25) {
                    int header25 = SafeParcelReader.readHeader(parcel);
                    int fieldId14 = SafeParcelReader.getFieldId(header25);
                    if (fieldId14 == 1) {
                        i20 = SafeParcelReader.readInt(parcel, header25);
                    } else if (fieldId14 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header25);
                    } else {
                        strCreateString44 = SafeParcelReader.createString(parcel, header25);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader25);
                return new C4104hA1(i20, strCreateString44);
            case 27:
                int iValidateObjectHeader26 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString45 = null;
                String strCreateString46 = null;
                while (parcel.dataPosition() < iValidateObjectHeader26) {
                    int header26 = SafeParcelReader.readHeader(parcel);
                    int fieldId15 = SafeParcelReader.getFieldId(header26);
                    if (fieldId15 == 1) {
                        strCreateString45 = SafeParcelReader.createString(parcel, header26);
                    } else if (fieldId15 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header26);
                    } else {
                        strCreateString46 = SafeParcelReader.createString(parcel, header26);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader26);
                return new C5835mA1(strCreateString45, strCreateString46);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iValidateObjectHeader27 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString47 = null;
                String strCreateString48 = null;
                while (parcel.dataPosition() < iValidateObjectHeader27) {
                    int header27 = SafeParcelReader.readHeader(parcel);
                    int fieldId16 = SafeParcelReader.getFieldId(header27);
                    if (fieldId16 == 1) {
                        strCreateString47 = SafeParcelReader.createString(parcel, header27);
                    } else if (fieldId16 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header27);
                    } else {
                        strCreateString48 = SafeParcelReader.createString(parcel, header27);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader27);
                return new C6599qA1(strCreateString47, strCreateString48);
            default:
                int iValidateObjectHeader28 = SafeParcelReader.validateObjectHeader(parcel);
                int i21 = 0;
                String strCreateString49 = null;
                String strCreateString50 = null;
                while (parcel.dataPosition() < iValidateObjectHeader28) {
                    int header28 = SafeParcelReader.readHeader(parcel);
                    int fieldId17 = SafeParcelReader.getFieldId(header28);
                    if (fieldId17 == 1) {
                        strCreateString49 = SafeParcelReader.createString(parcel, header28);
                    } else if (fieldId17 == 2) {
                        strCreateString50 = SafeParcelReader.createString(parcel, header28);
                    } else if (fieldId17 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header28);
                    } else {
                        i21 = SafeParcelReader.readInt(parcel, header28);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader28);
                return new C7171tA1(strCreateString49, strCreateString50, i21);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C7142t12[i];
            case 1:
                return new C6367oy1[i];
            case 2:
                return new C0562Gy1[i];
            case 3:
                return new C0406Ey1[i];
            case 4:
                return new C6752qz1[i];
            case 5:
                return new C7896wz1[i];
            case 6:
                return new C0721Iz1[i];
            case 7:
                return new C7553vA1[i];
            case 8:
                return new AbstractC4351iT0[i];
            case 9:
                return new C6801rE1[i];
            case 10:
                return new C1806Wx1[i];
            case 11:
                return new RA1[i];
            case 12:
                return new WA1[i];
            case 13:
                return new C3344dB1[i];
            case 14:
                return new C8086xz1[i];
            case 15:
                return new C0097Az1[i];
            case 16:
                return new C0487Fz1[i];
            case 17:
                return new C6029nB1[i];
            case 18:
                return new C1032Mz1[i];
            case 19:
                return new C1422Rz1[i];
            case 20:
                return new C8316zB1[i];
            case 21:
                return new C1890Xz1[i];
            case 22:
                return new VB1[i];
            case 23:
                return new C3347dC1[i];
            case 24:
                return new C5459kC1[i];
            case 25:
                return new C2465cA1[i];
            case 26:
                return new C4104hA1[i];
            case 27:
                return new C5835mA1[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new C6599qA1[i];
            default:
                return new C7171tA1[i];
        }
    }
}
