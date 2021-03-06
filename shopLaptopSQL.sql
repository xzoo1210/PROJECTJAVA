--create database [SE1435_PRJ321_DUPIHE141231]
USE [SE1435_PRJ321_DUPIHE141231]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_Category]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_Category](
	[cateID] [int] NOT NULL,
	[cateName] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_HE141231_DUPI_Category] PRIMARY KEY CLUSTERED 
(
	[cateID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_InforUser]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_InforUser](
	[inforID] [int] NOT NULL,
	[userID] [int] NOT NULL,
	[fullName] [nvarchar](50) NOT NULL,
	[address] [nvarchar](200) NOT NULL,
	[phoneNumber] [nvarchar](16) NOT NULL,
 CONSTRAINT [PK_HE141231_DUPI_InforUser] PRIMARY KEY CLUSTERED 
(
	[inforID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_Order]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_Order](
	[orderID] [int] NOT NULL,
	[customerID] [int] NOT NULL,
	[date] [date] NOT NULL,
	[totalPrice] [float] NOT NULL,
 CONSTRAINT [PK_HE141231_DUPI_Order] PRIMARY KEY CLUSTERED 
(
	[orderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_OrderDetail]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_OrderDetail](
	[OrderDetailID] [int] NOT NULL,
	[orderID] [int] NOT NULL,
	[productID] [int] NOT NULL,
	[quantity] [int] NOT NULL,
 CONSTRAINT [PK_HE141231_DUPI_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[OrderDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_Product]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_Product](
	[productid] [int] NOT NULL,
	[name] [nvarchar](800) NULL,
	[image] [nvarchar](800) NULL,
	[price] [float] NULL,
	[cateID] [int] NULL,
	[detail] [nvarchar](2000) NULL,
PRIMARY KEY CLUSTERED 
(
	[productid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_User]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_User](
	[UserID] [int] NOT NULL,
	[UserName] [nvarchar](100) NOT NULL,
	[Password] [nvarchar](20) NOT NULL,
	[authority] [int] NOT NULL,
 CONSTRAINT [PK_HE141231_DUPI_User] PRIMARY KEY CLUSTERED 
(
	[UserID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HE141231_DUPI_Vouchers]    Script Date: 4/1/2021 1:52:56 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HE141231_DUPI_Vouchers](
	[CodeID] [int] NOT NULL,
	[UserID] [int] NOT NULL,
	[Code] [nvarchar](10) NOT NULL,
	[ExistTime] [int] NULL,
	[discount] [int] NOT NULL,
 CONSTRAINT [PK_HE141231_DUPI_Vouchers] PRIMARY KEY CLUSTERED 
(
	[CodeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[HE141231_DUPI_Category] ([cateID], [cateName]) VALUES (1, N'MSI                 ')
INSERT [dbo].[HE141231_DUPI_Category] ([cateID], [cateName]) VALUES (2, N'DELL                ')
INSERT [dbo].[HE141231_DUPI_Category] ([cateID], [cateName]) VALUES (3, N'Asuss               ')
INSERT [dbo].[HE141231_DUPI_InforUser] ([inforID], [userID], [fullName], [address], [phoneNumber]) VALUES (1, 1, N'Pham Ich DU', N'BAC NINH', N'0369662341')
INSERT [dbo].[HE141231_DUPI_InforUser] ([inforID], [userID], [fullName], [address], [phoneNumber]) VALUES (5, 1, N'DUD', N'aaas', N'12341')
INSERT [dbo].[HE141231_DUPI_Order] ([orderID], [customerID], [date], [totalPrice]) VALUES (1, 1, CAST(N'2021-03-13' AS Date), 500)
INSERT [dbo].[HE141231_DUPI_OrderDetail] ([OrderDetailID], [orderID], [productID], [quantity]) VALUES (1, 1, 1, 5)
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (1, N'Laptop MSI Prestige 15 A10SC-222VN (i7 10710U/16GB RAM/GTX 1650 Max Q 4GB/512GB SSD/15.6 inch FHD/Win 10)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ', N'https://hanoicomputercdn.com/media/product/48771_msi_prestige_15_a10sc__6_.jpg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ', 1030, 1, N'Đánh giá Laptop MSI Prestige 15 A10SC-222VN lựa chọn hàng đầu của dân đồ họa Giới thiệu về Laptop MSI Prestige 15 A10SC-222VN Laptop MSI Prestige 15 đã chạm vào linh hồn của sự sáng tạo và khám phá bởi chính từ thiết kế tuyệt hảo của dòng laptop Prestige. Với thiết kế hoàn hảo, MSI Prestige 15 đã thực sự đẩy xa ranh giới sáng tạo. Đã đến lúc để nguồn cảm hứng được dâng trào và sáng tạo ra những khoảnh khắc riêng của bạn trong cuộc sống. Hôm nay HANOICOMPUTER xin gửi đến các bạn bài viết đánh giá về mẫu Laptop MSI Prestige 15 A10SC-222VN để các bạn có một cái nhìn tổng quát về dòng Laptop MSI Prestige 15 vô cùng thú vị này.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (2, N'Laptop Dell Inspiron 5593 (N5I5461W) (i5 1035G1/8GB RAM/512GB SSD/MX230 2GB/15.6 inch FHD/Win 10)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ', N'https://cdn.mediamart.vn/Product/-33D380.png                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ', 200, 2, N'Đẹp hơn với màu bạc sang trọng Có thể nói với trọng lượng gần 2 kg thì Laptop Dell Inspiron 5593 (P90F002N93A) sẽ khá cồng kềnh với những ai phải thường xuyên mang laptop bên mình. Nhưng bù lại lớp vỏ nhựa và màu bạc sang trọng đã là một điểm cộng cho chiếc máy thêm phần hiện đại, trẻ trung.    Không chỉ đẹp mà máy còn hứa hẹn sẽ mang đến cho bạn những giây phút giải trí tuyệt vời. Màn hình rộng đến 15.6 inch, độ phân giải Full HD mang đến những thước phim vô cùng ấn tượng với độ sắc nét tuyệt vời. Đặc biệt, Laptop Dell Inspiron 5593 (P90F002N93A) được thiết kế có đến 2 cổng USB 3.1 - thoải mái kết nối với các thiết bị đi kèm. Ngoài ra còn có những cổng thông thường: HDMI, LAN (RJ45), USB 2.0, USB Type-C  Cấu hình ổn định Được trang bị bộ vi xử lí Intel Core i7 thế hệ 10 mới ra mắt (cuối 2019), Laptop Dell Inspiron 5593 (P90F002N93A) xử lí mượt mà ở những tác vụ văn phòng như Word, Excel... phục vụ tốt các nhu cầu giải trí, xem phim trên Youtube của bạn. Ở phiên bản này, Dell cung cấp cho bạn thêm vga rời của Nvidia, giúp coõ máy có thể chiến được thêm hầu hết các game online có mặt trên thị trường.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (3, N'Laptop Asus ZenBook UX434FAC-A6064T (i5 10210U/8GB RAM/512GB SSD/14 inch FHD/Win 10/Xanh)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ', N'https://laptopworld.vn/media/product/5061_zenbook_ux434_silver.jpg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ', 300, 3, N'Sáng tạo. Phong cách. Đột phá. Đây là những phẩm chất đã tạo nên ASUS ZenBook UX334 thanh lịch mới. Một trong những mẫu máy tính xách tay 14 inch nhỏ gọn nhất thế giới được trang bị màn hình NanoEdge không viền ngoạn mục và ScreenPad™ 2.0 đột phá để bạn tự do khai phá sức mạnh sáng tạo.    Để tạo nên công nghệ âm thanh ASUS SonicMaster thế hệ tiếp theo, đội ngũ Golden Ear của ASUS đã hợp tác với các chuyên gia về hệ thống âm thanh xe hơi và gia đình lừng danh, Harman Kardon. Kết quả cuối cùng thực sự đáng kinh ngạc. Sự kết hợp tùy chỉnh giữa phần cứng cao cấp – trong đó có công nghệ bộ khuếch đại thông minh mang lại âm thanh lớn hơn mà không bị méo tiếng – và phần mềm được thiết kế khéo léo để bảo đảm rằng ZenBook 14 đem đến cho bạn trải nghiệm âm thanh tuyệt đỉnh.    ASUS ZenBook UX334 mang đến kỷ nguyên mới của thiết kế siêu linh hoạt với khung máy siêu nhỏ gọn và siêu nhẹ. Được trang bị màn hình NanoEdge trên bốn cạnh, ZenBook 14 là một trong những mẫu máy tính xách tay 14 inch nhỏ gọn nhất thế giới và nhỏ hơn 14% so với ZenBook 14 (UX434) thế hệ trước đó — Cho bạn thỏa sức sáng tạo mọi lúc mọi nơi!    Được thiết kế để truyền cảm hứng sáng tạo, ZenBook 14 không phải hy sinh bớt hiệu năng vì kích thước. Đây là mẫu máy được xây dựng để mang đến sức mạnh không giới hạn nhằm tối ưu trải nghiệm tác vụ máy tính khi di chuyển. Được trang bị bộ vi xử lý Intel® Core™, card đồ họa rời NVIDIA® mới nhất cùng với hàng loạt các linh kiện hiệu năng cao và chất lượng cao, ZenBook 14 sẽ không bao giờ để bạn phải chờ đợi. Dù bạn đang soạn lập tài liệu phức tạp, xử lí dữ liệu, chỉnh sửa ảnh hay biên tập video, ZenBook 14 đều cho phép bạn làm được nhiều hơn và nhanh hơn.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (5, N'Laptop MSI Prestige 15 A10SC-222VN ', N'https://hanoicomputercdn.com/media/product/48771_msi_prestige_15_a10sc__6_.jpg', 300, 1, N'giá')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (6, N'Laptop Dell Vostro 15 3500 7G3981 - Intel Core i5                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ', N'https://laptop88.vn/media/lib/27-02-2021/6262_dell_vostro_15_3500_7g3981.jpg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ', 250, 2, N'Hiệu năng mạnh mẽ, xử lý nhanh chóng mọi tác vụ  Với sức mạnh đáng kinh ngạc đến từ bộ vi xử lý Intel Core i5 Tiger Lake thế hệ 11, bạn sẽ dễ dàng giải quyết công việc trong chớp mắt bởi xung nhịp được boost lên tối đa 4.2 GHz. Nhờ đó, bạn có thể thực hiện từ các tác vụ văn phòng nhẹ nhàng cho tới các tác vụ nâng cao như Photoshop hay AI. Không chỉ vậy, con chip này còn sử dụng lõi Willow Cove giúp laptop ít tiêu hao năng lượng hơn giúp kéo dài thời gian sử dụng cho một lần sạc.  RAM 8 GB cho khả năng đa nhiệm tốt, bạn hoàn toàn có thể mở cùng lúc nhiều ứng dụng mà không cần phải lo lắng máy bị chậm. Bạn có thể vừa làm việc với các tác vụ đồ họa vừa mở YouTube nghe nhạc, giúp giảm căng thẳng trong quá trình làm việc. Máy còn hỗ trợ khe RAM tối đa lên đến 32 GB giúp bạn dễ dàng nâng cấp khi cần thiết.  Ổ cứng SSD 256 GB cho tốc độ phản hồi nhanh chóng gần như ngay lập tức sau khi nhấp chuột giúp bạn làm việc hiệu quả hơn. Ngoài ra, nó còn đem lại cho bạn một không gian lưu trữ thoải mái, tiện lợi khi lưu trữ các tệp thông tin lớn quan trọng.       Thiết kế nhỏ gọn, hiện đại  Nhờ vỏ máy được làm từ nhựa nên laptop Dell mang đến một trọng lượng khá nhẹ, chỉ 1.98 kg. Cộng với độ dày 19.9 mm bạn hoàn toàn có thể mang theo bên mình mọi lúc mọi nơi mà không cảm thấy cồng kềnh hay vướng víu.  Với mục đích chính là phục vụ cho công việc, Dell Vostro 3500 có rất nhiều cổng kết nối bao gồm 2 cổng USB 3.1, HDMI, LAN (RJ45), USB 2.0 và khe thẻ nhớ Micro SD giúp bạn truyền dữ liệu nhanh chóng, chia sẻ hình ảnh chất lượng qua các màn ảnh lớn. Ngoài ra laptop còn có cổng mạng kết nối không dây là Bluetooth 4.1, Wi-Fi 802.11 a/b/g/n/ac.  Thiết kế phím hợp lí, hành trình phím sâu và độ nảy khá tốt giúp cho bạn gõ phím nhanh và thoải mái. Hơn nữa, bàn phím cũng trang bị bàn phím số riêng để tiện cho việc nhập số liệu.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (7, N'Laptop C Dell Precision M4800 Intel Core i7 MQ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ', N'https://laptop88.vn/media/product/2434_dell_precision_m4800___3.png                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ', 250, 2, N'Đánh giá chi tiết  Dell Precision M4800 Intel Core i7 MQ      Là một Designer thì không thể bỏ qua siêu phẩm Dell Precision M4800 bởi:  - Cấu hình mạnh mẽ giúp máy làm tốt 2D, 3D trên các phần mềm như AutoCad, Sketchup, Revit...hay dựng 3D, render file nặng  - Với lớp vỏ ngoài chất liệu hợp kim nhôm còn đạt chuẩn MIL - STD 810G của quân đội Mỹ về độ bền bỉ và chống chịu va đập cực tốt  - Màn hình 15.6 inch FullHD, cùng tấm nền IPS cho khả năng tái tạo gần như đầy đủ dải màu tiêu chuẩn sẽ làm hài lòng cả những designer khó tính nhất')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (8, N'Laptop Dell Inspiron 5490 (FMKJV11) (i5 10210U/8GB RAM/512GBSSD/MX230 2G/14.0 inch FHD/Win10/Bạc)', N'https://hanoicomputercdn.com/media/product/56381_inspiron_5490__6_.jpg', 400, 2, N'Laptop Dell Vostro 5490 (FMKJV11) là một chiếc máy tính xách tay doanh nhân phong cách. Máy sở hữu bề ngoài bắt mắt, kết hợp cấu hình mạnh mẽ bởi thế hệ chip mới nhất hiện nay. Chiếc laptop di động này đã làm cho bao người dùng điêu đứng và muốn có được ngay từ lần nhìn đầu tiên.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (9, N'Máy tính xách tay MSI Gaming GP66 Leopard 10UE-206VN (i7 10870H/ 16GB/1TB SSD/RTX3060 6G/15.6 inch FHD 144Hz/win 10) (2021)', N'https://hanoicomputercdn.com/media/product/57674_gp66__5_.jpg', 499, 1, N'Đánh giá Laptop MSI Gaming GP66 Leopard 10UE-206VN (RTX3060 6G) Trong sự kiện "MSIOLOGY" vào đầu năm 2021, nhà "rồng đỏ" đã cho ra mắt hàng loạt các siêu phẩm laptop mới, trong đó có MSI GP66. Đây là mẫu laptop được thiết kế để phục vụ mọi nhu cầu hàng ngày của người dùng, cũng như chơi game hay các phép tính nặng của kỹ sư. Trong lần ra mắt lần này, GP66 được đánh giá rất cao nhờ vẻ ngoài sắc sảo, sang trọng, huyền bí và hiệu năng đỉnh cao nhờ bộ vi xử lý core i7 thế hệ 10 và card đồ họa Nvidia Geforce RTX 3060 6GB GDDR6. Nó sẽ cùng bạn chạm đến ước mơ!')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (10, N'Laptop MSI Gaming Stealth 15M A11SDK (060VN) (i7-1185G7/16GB RAM/512GB SSD/GTX1660Ti 6G MaxQ/15.6 inch FHD/Win 10/Trắng) (2020)', N'https://hanoicomputercdn.com/media/lib/55872_stealth-15m-b.jpg', 599, 1, N'Thiết kế siêu mỏng Chiếc máy Stealth 15M mới của MSI có vẻ sẽ mang đến cho Razer một số đối thủ mỏng manh đáng gờm trong phân khúc thiết bị di động chơi game 15 inch, đồng thời mang đến các tùy chọn lưu trữ trong và ngoài thế hệ tiếp theo có tốc độ cực nhanh.  Với trọng lượng 1,69kg và độ dày 1,6cm (theo MSI), Stealth 15M tuy chỉ mỏng hơn Razer’s Blade 15 Advanced một chút, nhưng lại nhẹ hơn đáng kể (2,13kg -1,77cm). Khung máy bằng nhôm sẽ được bao phủ bởi lớp màu xám carbon hoặc trắng, với sự kết hợp của CPU Intel Tiger Lake thế hệ thứ 11 và card đồ họa Nvidia RTX 2060 Max-Q bên trong.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (11, N'Laptop Asus ROG Zephyrus G15 GA502IU-AL007T (R7 4800HS/8GB RAM/512GB SSD/15.6 inch FHD 144Hz/GTX 1660Ti 6GB/Win10/Balo/Đen)', N'https://hanoicomputercdn.com/media/lib/55085_GA502IV-1.jpg', 399, 3, N'Đánh giá Laptop Asus ROG Zephyrus G15 GA502IU-AL007T mạnh mẽ, chiến tốt mọi tựa game CHUẨN MỰC MỚI VỀ LAPTOP GAMING SIÊU MỎNG   Zephyrus G15 GA502IU-AL007T định nghĩa lại khả năng chơi game với dòng laptop gaming siêu mỏng. Thiết kế mới giúp giải phóng tiềm năng thực sự của AMD® Ryzen™ 7 và GPU GeForce® GTX 1660Ti 6GB . Kết hợp với màn hình hỗ trợ tân số quét 144hz chuẩn mực PANTONE®.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (12, N'Laptop Asus VivoBook A512DA-EJ1448T (R3 3250U/4GB RAM/512GB SSD/15.6" FHD/Win10/Bạc)', N'https://www.hanoicomputer.vn/media/lib/asusvivobooka512da-ej829t.jpg', 489, 3, N'Asus VivoBook A512DA-EJ1448T là dòng laptop phổ thông có mức giá chỉ tầm 11 triệu đồng nhưng lại được ASUS trang bị SSD NVMe lên tới 512 Gb. Cú chơi lớn của Asus này cùng việc trang bị cho VivoBook A512DA-EJ1448T một cấu hình tương đối ổn so với mức giá như một đòn chí mạng cho các thương hiệu khác ở phân khúc phổ thông.   Thiết kế mỏng nhẹ Nếu như trước kia chỉ dòng sản phẩm cao cấp Zenbook mới được Asus chăm chút về thiết kế tối với sự sang trọng và tinh tế,thì trong năm nay  VivoBook A512DA-EJ1448T cũng nhận được sự chăm chút tỉ mỉ đến từng chi tiết nhỏ mặc dù chỉ là dòng sản phẩm ở phân khúc phổ thông. Asus VivoBook A512DA-EJ1448T được thiết kế với dạng ultrabook đa màu sắc,  kích thước nhỏ gọn với cân nặng chỉ 1.7kg, rất phù hợp để mang theo trong những chuyến công tác hay cuộc họp.')
INSERT [dbo].[HE141231_DUPI_Product] ([productid], [name], [image], [price], [cateID], [detail]) VALUES (13, N'Laptop Gaming Asus TUF FA506IV-HN202T (R7 4800H/16GB RAM/1TB SSD/15.6 FHD 144Ghz/RTX 2060 6GB/Win10/Balo/Xám)', N'https://hanoicomputercdn.com/media/product/52709_asus_gaming_tuf_fa506iv_hn202t__9_.jpg', 1500, 3, N'Thiết kế mang tính di động Mặc dù tự hào với khung máy có thiết kế nhỏ hơn và nhẹ hơn so với người tiền nhiệm. Khung máy Fortress Grey lịch lãm và bóng bẩy. Thiết kế tổ ong tinh tế được trang trí trên bề mặt dưới khung máy giúp tăng độ bám cũng như khả năng lưu thông không khí làm mát, trong khi thiết kế trải xước trên chiếu nghỉ tay giữ cho bề mặt luôn bóng mượt và sạch sẽ.Độ bền cấp quân đội Asus TUF FA506IV-HN202T được trải qua các tiêu chuẩn khắt khe trong các bài kiểm tra độ bền MIL-STD-810H. Các thiết bị được thử nghiệm như rơi rớt, độ rung, độ ẩm và nhiệt độ khắc nghiệt để đảm bảo độ tin cậy.')
INSERT [dbo].[HE141231_DUPI_User] ([UserID], [UserName], [Password], [authority]) VALUES (1, N'DU', N'23', 1)
INSERT [dbo].[HE141231_DUPI_User] ([UserID], [UserName], [Password], [authority]) VALUES (2, N'admin                                                                                               ', N'admin               ', 1)
INSERT [dbo].[HE141231_DUPI_User] ([UserID], [UserName], [Password], [authority]) VALUES (3, N'CUS                                                                                                 ', N'cus                 ', 2)
INSERT [dbo].[HE141231_DUPI_User] ([UserID], [UserName], [Password], [authority]) VALUES (4, N'Cus1                                                                                                ', N'cus1                ', 2)
INSERT [dbo].[HE141231_DUPI_User] ([UserID], [UserName], [Password], [authority]) VALUES (5, N'1                                                                                                   ', N'1                   ', 2)
INSERT [dbo].[HE141231_DUPI_Vouchers] ([CodeID], [UserID], [Code], [ExistTime], [discount]) VALUES (1, 1, N'AAA', 3, 30)
INSERT [dbo].[HE141231_DUPI_Vouchers] ([CodeID], [UserID], [Code], [ExistTime], [discount]) VALUES (2, 2, N'BBB', 5, 40)
INSERT [dbo].[HE141231_DUPI_Vouchers] ([CodeID], [UserID], [Code], [ExistTime], [discount]) VALUES (3, 1, N'CCC', 3, 11)
ALTER TABLE [dbo].[HE141231_DUPI_InforUser]  WITH CHECK ADD  CONSTRAINT [FK_HE141231_DUPI_InforUser_HE141231_DUPI_User] FOREIGN KEY([userID])
REFERENCES [dbo].[HE141231_DUPI_User] ([UserID])
GO
ALTER TABLE [dbo].[HE141231_DUPI_InforUser] CHECK CONSTRAINT [FK_HE141231_DUPI_InforUser_HE141231_DUPI_User]
GO
ALTER TABLE [dbo].[HE141231_DUPI_Order]  WITH CHECK ADD  CONSTRAINT [FK_HE141231_DUPI_Order_HE141231_DUPI_User] FOREIGN KEY([customerID])
REFERENCES [dbo].[HE141231_DUPI_User] ([UserID])
GO
ALTER TABLE [dbo].[HE141231_DUPI_Order] CHECK CONSTRAINT [FK_HE141231_DUPI_Order_HE141231_DUPI_User]
GO
ALTER TABLE [dbo].[HE141231_DUPI_OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_HE141231_DUPI_OrderDetail_HE141231_DUPI_Order] FOREIGN KEY([orderID])
REFERENCES [dbo].[HE141231_DUPI_Order] ([orderID])
GO
ALTER TABLE [dbo].[HE141231_DUPI_OrderDetail] CHECK CONSTRAINT [FK_HE141231_DUPI_OrderDetail_HE141231_DUPI_Order]
GO
ALTER TABLE [dbo].[HE141231_DUPI_OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_HE141231_DUPI_OrderDetail_HE141231_DUPI_Product] FOREIGN KEY([productID])
REFERENCES [dbo].[HE141231_DUPI_Product] ([productid])
GO
ALTER TABLE [dbo].[HE141231_DUPI_OrderDetail] CHECK CONSTRAINT [FK_HE141231_DUPI_OrderDetail_HE141231_DUPI_Product]
GO
ALTER TABLE [dbo].[HE141231_DUPI_Product]  WITH CHECK ADD FOREIGN KEY([cateID])
REFERENCES [dbo].[HE141231_DUPI_Category] ([cateID])
GO
ALTER TABLE [dbo].[HE141231_DUPI_Vouchers]  WITH CHECK ADD  CONSTRAINT [FK_HE141231_DUPI_Vouchers_HE141231_DUPI_User] FOREIGN KEY([UserID])
REFERENCES [dbo].[HE141231_DUPI_User] ([UserID])
GO
ALTER TABLE [dbo].[HE141231_DUPI_Vouchers] CHECK CONSTRAINT [FK_HE141231_DUPI_Vouchers_HE141231_DUPI_User]
GO
