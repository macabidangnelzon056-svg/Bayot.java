<!DOCTYPE html>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>HTML Layout Example</title>
     <style>
         * {
             margin: 0;
             padding: 0;
             box-sizing: border-box;
         }
         /* Assign classes to match layout sectionsiuio */
         .header { background: #f0f0f0; padding: 20px; text-align: center; }
         .menu-bar { background: #333; color: white; padding: 10px; }
         .menu-bar ul { list-style: none; display: flex; gap: 20px; }
         .main-container { display: flex; }
         .side-menu { background: #e0e0e0; width: 200px; padding: 20px; }
         .content-area { flex: 1; padding: 20px; }
         .content1 { background: #f8f8f8; padding: 20px; margin-bottom: 20px; }
         .content2 { background: #f8f8f8; padding: 20px; }
         .sidebar-right { background: #e0e0e0; width: 150px; padding: 20px; }
         .footer { background: #333; color: white; padding: 20px; text-align: center; }
     </style>
 </head>
 <body>
     <!-- Header Section -->
     <div class="header">
         <h1>Header (H)</h1>
     </div>
     <!-- Menu Bar Section -->
     <div class="menu-bar">
         <ul>
             <li>Home</li>
             <li>About</li>
             <li>Services</li>
             <li>Contact</li>
         </ul>
     </div>
     <!-- Main Content Container -->
     <div class="main-container">
         <!-- Side Menu (Left) -->
         <div class="side-menu">
             <h3>Side Menu</h3>
             <p>Links/Options Here</p>
         </div>
         <!-- Main Content Blocks (C1, C2) -->
         <div class="content-area">
             <div class="content1">
                 <h2>Content 1 (C1)</h2>
                 <p>Primary content section...</p>
             </div>
             <div class="content2">
                 <h2>Content 2 (C2)</h2>
                 <p>Secondary content section...</p>
             </div>
         </div>
         <!-- Right Sidebar (SB) -->
         <div class="sidebar-right">
             <h3>Sidebar (SB)</h3>
             <p>Additional info here</p>
         </div>
     </div>
     <!-- Footer Section -->
     <div class="footer">
         <p>Footer (F) - © 2026 All Rights Reserved</p>
     </div>
 </body>
 </html>