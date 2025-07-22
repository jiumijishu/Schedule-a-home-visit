package co.xiaoxiang.modules.shop.service;

import co.xiaoxiang.modules.activity.web.vo.YxStoreSeckillQueryVo;
import co.xiaoxiang.modules.shop.entity.YxStoreProduct;

import java.awt.FontFormatException;
import java.io.IOException;

public interface CreatShareProductService {

    String creatProductPic(YxStoreProduct productDTO, String qrcode, String spreadPicName, String spreadPicPath, String apiUrl) throws IOException, FontFormatException;

    String creatSeckillPic(YxStoreSeckillQueryVo seckillDTO, String qrcode, String spreadPicName, String spreadPicPath, String apiUrl) throws IOException, FontFormatException;
}
